package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.Employee;

public class EmployeeDAO {
	public static Connection getConnection() throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee","root","@Joker123");
		System.out.println("Connection Establishd");
		return con;
	}
	
	public static int EmployeeRegistation (Employee e)throws ClassNotFoundException,SQLException{
		int i = 0;
		System.out.println("e ="+e);
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement("Insert into employee (Firstname,Lastname,email,age)values(?,?,?,?)");
		
		pstmt.setString(1,e.getFirstname());
		pstmt.setString(2, e.getLastName());
		pstmt.setString(3,e.getEmail());
		pstmt.setInt(4, e.getAge());
		
		i = pstmt.executeUpdate();
		
		pstmt.close();
		con.close();
		return i;
		}
}
