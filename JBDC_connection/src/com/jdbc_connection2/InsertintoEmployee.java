package com.jdbc_connection2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertintoEmployee {

    private static void insertIntoEmployee(String name, String dept, double salary) {

        String sql = "INSERT INTO employee(name, department, salary) VALUES ('"
                + name + "', '"
                + dept + "', "
                + salary + ")";

        try (Connection conn = Jdbc_Connection.getConnection();
             Statement st = conn.createStatement()) {

            int rows = st.executeUpdate(sql);

            System.out.println(rows + " row is affected");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        insertIntoEmployee("sathyam", "IT", 1200);

    }
}