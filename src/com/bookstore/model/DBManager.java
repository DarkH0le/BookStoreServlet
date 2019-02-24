package com.bookstore.model;

import java.sql.*;

public class DBManager {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345678";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/bookstore";

//    public static ResultSet executeQuery(String query) {
//        try (
//                Connection conn = getConnection();
//                Statement stmt = conn.createStatement();
//                ResultSet queryResult = stmt.executeQuery(query);
//        ) {
//            return queryResult;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    private static Connection getConnection() throws SQLException, ClassNotFoundException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        return DriverManager.getConnection(USERNAME, PASSWORD, CONN_STRING);
//    }

    public static Connection getConnectionToDatabase() {
        Connection connection = null;

        try {

            // load the driver class
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("MySQL JDBC Driver Registered!");

            // get hold of the DriverManager
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "12345678");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();

        }
        catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();

        }

        if (connection != null) {
            System.out.println("Connection made to DB!");
        }
        return connection;
    }
}
