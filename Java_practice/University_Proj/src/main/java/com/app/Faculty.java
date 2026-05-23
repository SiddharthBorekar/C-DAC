package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Faculty
 */
@WebServlet("/faculty")
public class Faculty extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Faculty() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		
		if(user.equals("Bajaj")&&pass.equals("Bajaj123")) {
			/*
			 * // out.write("Login sucessfull!!!" );
			 */			req.getRequestDispatcher("regStudent.html").include(req, resp);
		}
		else {
			//out.write("Invalid UserName or Password!!" );
			req.getRequestDispatcher("faculty.html").include(req, resp);
		}
		
	} 	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}