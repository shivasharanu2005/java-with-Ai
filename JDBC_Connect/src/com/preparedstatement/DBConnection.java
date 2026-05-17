package com.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static String url = "jdbc:mysql://localhost:3306/company";

	private static String user = "root";
	private static String password = "cec123";

	public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
}
