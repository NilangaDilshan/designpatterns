package com.dilshan.designPatterns.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USER_NAME = "userName";
    private static final String PASSWORD = "password";

    private Connection connection;

    private static DatabaseConnection databaseConnection;

    private DatabaseConnection() {

        try {
            connection = DriverManager.getConnection(JDBC_URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error in database connection. Message: " + e.getMessage());
        }
    }

    public static DatabaseConnection getDatabaseConnection() {
        if (null == databaseConnection) {
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }

    public Connection getConnection() {
        return this.connection;
    }

    public static class Test {
        public static void main(String[] args) {
            DatabaseConnection dc = DatabaseConnection.getDatabaseConnection();
            Connection connection = dc.getConnection();
            System.err.print(dc.toString() + " " + connection.toString());
        }
    }
}
