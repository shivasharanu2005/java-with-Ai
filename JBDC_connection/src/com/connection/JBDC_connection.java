package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JBDC_connection {
	public static void main(String[] args) {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");;
			String url="jdbc:mysql://localhost:3306/school";
			String user ="root";
			String password="cec123";
			Connection connection =
	DriverManager.getConnection(url,user,password);
			System.out.println("Conncection successfull");
			System.out.println(connection.getCatalog());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
