package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JBDC_connection3 {
	public static void main(String[] args) {

		try {
			// Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Database Connection
			String url = "jdbc:mysql://localhost:3306/company";
			String user = "root";
			String password = "cec123";

			Connection connection = DriverManager.getConnection(url, user, password);

			System.out.println("Connection successful");
			System.out.println(connection.getCatalog());

			// Create Statement
			Statement st = connection.createStatement();

			// SQL Query
			String sql = "CREATE TABLE employee (" + "id INT PRIMARY KEY AUTO_INCREMENT, " + "name VARCHAR(20), "
					+ "department VARCHAR(20), " + "salary DOUBLE)";

			// Execute Query
			st.execute(sql);

			System.out.println("Table created successfully");

			// Close Resources
			st.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
