package com.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteQuery {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Enter your employee id:");
			int empId = in.nextInt();
			
			Connection con = DatabaseConnection.conn();
			
			String query = "SELECT * FROM employee WHERE empid = ?";			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, empId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				String deleteQuery = "DELETE FROM employee WHERE empid = ?";
				PreparedStatement ps1 = con.prepareStatement(deleteQuery);
				ps1.setInt(1, empId);
				ps1.executeUpdate();
				System.out.println("Delete Successfull");
				ps1.close();
			}else {
				System.out.println("Delete Unsuccessfull");
			}
			ps.close();
			con.close();
			in.close();
		}catch(SQLException e) {
			System.out.println("ERROR:"+e.getMessage());
		}
	}
}
