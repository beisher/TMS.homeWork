package com.tms.lesson13JDBC.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCconfiguration {
    public static Connection getConnection() {
        String url = "jdbc:postgresql://localhost:5432/";
        String database = "postgres";
        String userName = "postgres";
        String password = "password";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url + database , userName , password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}