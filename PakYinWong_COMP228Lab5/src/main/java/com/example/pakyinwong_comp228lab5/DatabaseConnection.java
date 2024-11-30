package com.example.pakyinwong_comp228lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:oracle:thin:@199.212.26.208:1521:SQLD"; // Update with your DB URL
    private static final String USERNAME = "COMP228_F24_soh_31"; // Replace with your Oracle username
    private static final String PASSWORD = "P@ssw0rd"; // Replace with your Oracle password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
