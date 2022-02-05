package com.tms.lesson13JDBC.persistance;

import com.tms.lesson13JDBC.entity.SEX;
import com.tms.lesson13JDBC.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserService implements Entity<User> {
    private Connection connection;
    private static final String ID_COLUMN = "id";
    private static final String NAME_COLUMN = "name";
    private static final String SEX_COLUMN = "sex";
    private static final String BIRTHDAY_COLUMN = "birthday";


    public UserService(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement("insert into users (name , sex , birthday) values (? , ? , ?)");
            statement.setString(1, user.getName());
            statement.setBoolean(2, user.getSex() == SEX.MAN);
            statement.setDate(3, user.getDate());

            int i = statement.executeUpdate();

        } catch (SQLException exc) {
            exc.printStackTrace();
        }
    }

    @Override
    public boolean update(User user) {
        try {
            User userFromBD = get(user.getId());

            if (Objects.isNull(userFromBD)) {
                throw new SQLException("no user for updating");
            }

            PreparedStatement statement = connection.prepareStatement("update users set name = ? , sex = ? , birthday = ? where id = ?");

            statement.setString(1, user.getName());
            statement.setBoolean(2, user.getSex() == SEX.MAN);
            statement.setDate(3, user.getDate());
            statement.setInt(4, user.getId());
            statement.executeUpdate();

            return true;

        } catch (SQLException exc) {
            exc.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(User user) {
        int id = user.getId();
        try {
            PreparedStatement statement = connection.prepareStatement("delete from users where id = ?");
            statement.setInt(1, id);
            int i = statement.executeUpdate();
            if(i == 0) {
                throw new SQLException("no user in database");
            } return true;
        } catch (SQLException exc) {
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public User get(Integer id) {
        User user = null;

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users where id = " + id);

            if (resultSet.next()) {
                int idDb = resultSet.getInt(ID_COLUMN);
                String name = resultSet.getString(NAME_COLUMN);
                boolean sex = resultSet.getBoolean(SEX_COLUMN);
                Date birthday = resultSet.getDate(BIRTHDAY_COLUMN);

                user = new User(idDb, name, SEX.getBoolean(sex), birthday);
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> getAll() {
        List<User> users = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users");

            while (resultSet.next()) {
                int idDb = resultSet.getInt(ID_COLUMN);
                String name = resultSet.getString(NAME_COLUMN);
                boolean sex = resultSet.getBoolean(SEX_COLUMN);
                Date birthday = resultSet.getDate(BIRTHDAY_COLUMN);

                User user = new User(idDb, name, SEX.getBoolean(sex), birthday);
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}