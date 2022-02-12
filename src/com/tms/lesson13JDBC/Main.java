package com.tms.lesson13JDBC;

import com.tms.lesson13JDBC.config.JDBCconfiguration;
import com.tms.lesson13JDBC.entity.SEX;
import com.tms.lesson13JDBC.entity.User;
import com.tms.lesson13JDBC.persistance.Entity;
import com.tms.lesson13JDBC.persistance.UserService;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCconfiguration.getConnection();

        Entity<User> userService = new UserService(connection);
        User user = userService.get(11);
        System.out.println(user);

        System.out.println("----------");
        List<User> all = userService.getAll();
        System.out.println(all);
        User user1 = new User("HELLO", SEX.WOMAN, Date.valueOf("2022-01-01"));

        user.setName("BYUBYU");
        user.setSex(SEX.MAN);
        user.setDate(Date.valueOf("2000-09-09"));
        user.setId(11);
        boolean delete = userService.delete(user);

        System.out.println(delete ? "deleted" : "cant delete");

        connection.close();
    }
}