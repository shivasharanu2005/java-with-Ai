package com.jdbc_connection2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JBDCinsert {

    // 1. Insert Employee (Converted to PreparedStatement)
    private static void insertIntoEmployee(String name, String dept, double salary) {
        // Use '?' placeholders instead of string concatenation
        String sql = "INSERT INTO employee(name, department, salary) VALUES (?, ?, ?)";

        try (
                Connection conn = Jdbc_Connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            // Safely bind parameters
            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setDouble(3, salary);

            int rows = ps.executeUpdate();
            System.out.println(rows + " row inserted successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 2. Fetch All Employees (Converted to PreparedStatement)
    private static void fetchAllEmployees() {
        String sql = "SELECT * FROM employee";

        try (
                Connection conn = Jdbc_Connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery() // Execute directly from the PreparedStatement
        ) {

            System.out.println("\nEmployee Details");
            System.out.println("-----------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("department");
                double salary = rs.getDouble("salary");

                System.out.println(id + " | " + name + " | " + dept + " | " + salary);
            }
            System.out.println("-----------------------------\n");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 3. Update Employee Salary Using ID (Already PreparedStatement)
    private static void updateEmployeeSalaryUsingId(int id, double newSalary) {
        String sql = "UPDATE employee SET salary = ? WHERE id = ?";

        try (
                Connection conn = Jdbc_Connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setDouble(1, newSalary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            System.out.println(rows + " row updated successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 4. Delete Employee Using ID (Already PreparedStatement)
    private static void deleteEmployeeUsingId(int id) {
        String sql = "DELETE FROM employee WHERE id = ?";

        try (
                Connection conn = Jdbc_Connection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            System.out.println(rows + " row deleted successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 5. User Login Verification (Already PreparedStatement & Fixed Table Name to `user`)
    private static void loginUser(String username, String password) {
        // Fixed: Changed table from 'users' to '`user`' to match your actual database
        String sql = "SELECT * FROM `user` WHERE username=? AND password=?";

        try (
                Connection con = Jdbc_Connection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, username);
            ps.setString(2, password);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Login Successful");
                } else {
                    System.out.println("Invalid Username or Password");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        // Insert Employee
        insertIntoEmployee("Sathyam", "IT", 1200);

        // Fetch Employees
        fetchAllEmployees();

        // Update Salary
        updateEmployeeSalaryUsingId(1, 5000);
        updateEmployeeSalaryUsingId(3, 5545);
        updateEmployeeSalaryUsingId(5, 78876);

        // Delete Employee
        deleteEmployeeUsingId(7);

        // Login Check
        loginUser("admin_boss", "adminPass123");

        // Fetch Again
        fetchAllEmployees();
    }
}