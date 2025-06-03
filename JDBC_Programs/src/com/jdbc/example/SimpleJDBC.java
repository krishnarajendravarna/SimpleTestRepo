package com.jdbc.example;

import java.sql.Connection;

public class SimpleJDBC {
	public static void main(String[] args) {
		Connection con = DatabaseConnection.conn();
		if(con != null) {
			System.out.println("Connection successfully obtained");
		}else {
			System.out.println("Connection not successfully obtained");
		}
	}
}
