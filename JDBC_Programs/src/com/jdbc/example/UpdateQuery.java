package com.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateQuery {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Enter your employee id:");
			int empId = in.nextInt();
			System.out.println("Enter your email id:");
			String emailId = in.next();

			Connection con = DatabaseConnection.conn();

			String query = "SELECT empid FROM employee WHERE empid = ?";

			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, empId);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				String updateQuery = "UPDATE employee SET email = ? WHERE empid = ?";
				PreparedStatement ps1 = con.prepareStatement(updateQuery);
				ps1.setString(1, emailId);
				ps1.setInt(2, empId);
				ps1.executeUpdate();
				System.out.println("Update successfully");
				ps1.close();
			} else {
				System.out.println("Update unsuccessfull");
			}
			ps.close();
			con.close();
			in.close();
		} catch (SQLException e) {
			System.out.println("ERROR:" + e.getMessage());
		}
	}
}
