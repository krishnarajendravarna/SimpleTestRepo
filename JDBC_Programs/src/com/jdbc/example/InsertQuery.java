package com.jdbc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InsertQuery {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Enter your name:");
			String name = in.next();
			System.out.println("Enter your position:");
			String pos = in.next();
			System.out.println("Enter your salary:");
			double sal = in.nextDouble();
			System.out.println("Enter your join date:");
			String jdate = in.next();

			Connection con = DatabaseConnection.conn();

			String query = "INSERT INTO employee(empid,name,position,salary,joindate) VALUES(empid_seq.NEXTVAL,?,?,?,?)";

			SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
			Date utilDate = sdf.parse(jdate);
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, pos);
			ps.setDouble(3, sal);
			ps.setDate(4, sqlDate);

			int rowAffected = ps.executeUpdate();

			if (rowAffected > 0) {
				System.out.println("Successfully Inserted");
			} else {
				System.out.println("Unsuccessfull");
			}
			ps.close();
			con.close();
			in.close();
		} catch (InputMismatchException e) {
			System.out.println("Invalid input! Please enter valid input");
		} catch (SQLException e) {
			System.out.println("ERROR:" + e.getMessage());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
