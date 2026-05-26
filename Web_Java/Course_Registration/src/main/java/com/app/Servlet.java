package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String course = request.getParameter("course");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			 
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Registration","root","@Joker123");
			PreparedStatement pst = con.prepareStatement("insert into Student(name,email,password,course)"
					+ "values(?,?,?,?)");
			
			pst.setString(1, name);
			pst.setString(2, email);
			pst.setString(3, password);
			pst.setString(4, course);
			

			int i = pst.executeUpdate();

			System.out.println("Rows Inserted = " + i);

			if(i > 0) {

			    request.setAttribute("name", name);
			    request.setAttribute("email", email);
			    request.setAttribute("course", course);

			    request.getRequestDispatcher("Login.jsp")
			           .forward(request, response);

			}
			else {
			    out.println("Registration Failed");
			}

            con.close();
			
		} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



