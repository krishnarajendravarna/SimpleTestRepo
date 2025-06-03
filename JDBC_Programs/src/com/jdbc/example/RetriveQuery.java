package com.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RetriveQuery {
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
				System.out.println("Employee ID:"+rs.getInt(1)+"\nName:"+rs.getString(2)+"\nPosition:"+rs.getString(3)+"\nSalary:"+rs.getDouble(4)+"\nEmail:"+rs.getString(5));
			}else {
				System.out.println("Account not found!");
			}
			ps.close();
			con.close();
			in.close();
		}catch(SQLException e) {
			System.out.println("ERROR:"+e.getMessage());
		}
	}
}
