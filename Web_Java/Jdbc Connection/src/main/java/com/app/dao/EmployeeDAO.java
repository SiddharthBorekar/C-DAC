package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.Employee;

public class EmployeeDAO {

	public static Connection getconnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");	
		System.out.println("Driver Found");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee", "root", "password");
		System.out.println("Connection Established");
		return conn;
	}
	
	public static int employeRegistation(Employee e) throws ClassNotFoundException , SQLException{
		
			int i = 0;
			try {	
			System.out.println("e = "+e);
			Connection conn = getconnection();
			PreparedStatement pstmt = conn.prepareStatement("insert into employee (firstname,lastname,email,age,gender) values(?,?,?,?,?)");
			pstmt.setString(1, e.getFirstname());
			pstmt.setString(2, e.getLastname());
			pstmt.setString(3, e.getEmail());
			pstmt.setInt(4, e.getAge());
			pstmt.setBoolean(5, e.isGender());
			
			i = pstmt.executeUpdate();
			
			pstmt.close();
	        conn.close();
			
			return i;
		}
			catch(Exception ex) {
				ex.printStackTrace();
				return i;
			}
		}
	}	
