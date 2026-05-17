package com.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JBDC_connection2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/company";
			String user = "root";
			String password = "cec123";
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Conncection successfull");
			System.out.println(connection.getCatalog());
			Statement st = connection.createStatement();
			String sql = "select *from students";
			ResultSet executeQuery = st.executeQuery(sql);
			while (executeQuery.next()) {
				System.out.println("Id:" + executeQuery.getInt("Id") + "name:" + executeQuery.getString("name")
						+ "email:" + executeQuery.getString("email"));
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
