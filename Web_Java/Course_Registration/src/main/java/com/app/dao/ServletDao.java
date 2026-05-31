package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.app.bean.Student;

import jakarta.servlet.annotation.WebServlet;


@WebServlet("/Register")
public class ServletDao {

    public static Connection getConnection() 
            throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Found!!!!!");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/Registration","root","@Joker123");

        System.out.println("Connection Establish!!!!!");

        return con;
    }

    public static int add(Student s) {

        int i = 0;

        try {

            Connection con = getConnection();

            PreparedStatement pst = con.prepareStatement(
                    "insert into Student(name,email,password,course) values(?,?,?,?)");

            pst.setString(1, s.getName());
            pst.setString(2, s.getEmail());
            pst.setString(3, s.getPassword());
            pst.setString(4, s.getCourse());

            i = pst.executeUpdate();

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }

        return i;
    }
}