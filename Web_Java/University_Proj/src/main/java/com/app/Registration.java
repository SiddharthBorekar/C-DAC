package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/register")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String prn = req.getParameter("prn");
		float sub1 = Float.parseFloat(req.getParameter("sub1"));
		float sub2 = Float.parseFloat(req.getParameter("sub2"));
		float sub3 = Float.parseFloat(req.getParameter("sub3"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found!!!");
			Connection con =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sidd","root","@Joker123");
			System.out.println("connection SucessFull ");
			
			 PreparedStatement pst =con.prepareStatement("insert into Employee(prn,sub1,sub2,sub3) values(?,?,?,?)");
			 pst.setString(1, prn);
			 pst.setFloat(2,sub1 );
			 pst.setFloat(3,sub2 );
			 pst.setFloat(4,sub3 );

			int i = pst.executeUpdate();
			
			if(i==1) {
				req.getRequestDispatcher("regStudent.html").include(req, resp);
			}
			else {
				req.getRequestDispatcher("regStudent.html").include(req, resp);
				
			}
			con.close();
			pst.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}