package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static Connection conn() {
		final String URL = "jdbc:oracle:thin:system/system@DESKTOP-HFQR517:1521/XE";
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(URL);
		} catch (ClassNotFoundException e) {
			System.out.println("[ERROR] " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
		return con;
	}
}
