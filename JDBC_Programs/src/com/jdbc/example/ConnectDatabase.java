package com.jdbc.example;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class ConnectDatabase {

	public static void main(String[] args) {
		String URL = "jdbc:oracle:thin:@localhost:1521/XE";
		String USER = "system";
		String PASS = "system";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//load the driver
			Connection con = DriverManager.getConnection(URL,USER,PASS);//open the connection
			System.out.println("Connected Sucessfully");
			
			/*String query = "INSERT INTO student(name,rollno) VALUES(?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, "Rajendra");
			ps.setInt(2, 21067);
			int insert = ps.executeUpdate();
			if(insert > 0) {
				System.out.println("Inserted successfully");
			}else {
				System.out.println("Unsuccessfull");
			}*/
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM student");
			while(rs.next()) {
				System.out.println("Name:"+rs.getString("name")+" Rollno:"+rs.getInt("rollno"));
			}
			rs.close();
			st.close();
			//ps.close();
			con.close();
		}catch(ClassNotFoundException e) {
			System.out.println("[ERROR] "+e.getMessage());
		}catch(SQLException e) {
			System.out.println("[ERROR] "+e.getMessage());
		}
	}

}
