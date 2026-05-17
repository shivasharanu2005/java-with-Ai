package com.jdbc_connection2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_featchupdatedelate {

	// Insert Employee
	private static void insertIntoEmployee(String name, String dept, double salary) {

		String sql = "INSERT INTO employee(name, department, salary) VALUES ('" + name + "', '" + dept + "', " + salary
				+ ")";

		try (Connection conn = Jdbc_Connection.getConnection(); Statement st = conn.createStatement()) {

			int rows = st.executeUpdate(sql);

			System.out.println(rows + " row inserted successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Fetch All Employees
	private static void fetchAllEmployees() {

		String sql = "SELECT * FROM employee";

		try (Connection conn = Jdbc_Connection.getConnection();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql)) {

			System.out.println("Employee Details");
			System.out.println("-----------------------------");

			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				String dept = rs.getString("department");
				double salary = rs.getDouble("salary");

				System.out.println(id + " | " + name + " | " + dept + " | " + salary);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Update Employee Salary Using ID
	private static void updateEmployeeSalaryUsingId(int id, double newSalary) {

		String sql = "UPDATE employee SET salary = " + newSalary + " WHERE id = " + id;

		try (Connection conn = Jdbc_Connection.getConnection(); Statement st = conn.createStatement()) {

			int rows = st.executeUpdate(sql);

			System.out.println(rows + " row updated successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Delete Employee Using ID
	private static void deleteEmployeeUsingId(int id) {

		String sql = "DELETE FROM employee WHERE id = " + id;

		try (Connection conn = Jdbc_Connection.getConnection(); Statement st = conn.createStatement()) {

			int rows = st.executeUpdate(sql);

			System.out.println(rows + " row deleted successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		// Insert Employee
		insertIntoEmployee("sharanu", "IT", 1200);

		// Fetch Employees
		fetchAllEmployees();

		// Update Salary
		updateEmployeeSalaryUsingId(1, 5000);

		// Delete Employee
		deleteEmployeeUsingId(2);

		// Fetch Again
		fetchAllEmployees();
	}
}