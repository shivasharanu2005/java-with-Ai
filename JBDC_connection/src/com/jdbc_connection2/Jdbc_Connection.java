package com.jdbc_connection2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc_Connection {

    private static String url = "jdbc:mysql://localhost:33060/company";
    
    private static String user = "root";
    private static String password = "cec123";

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}  