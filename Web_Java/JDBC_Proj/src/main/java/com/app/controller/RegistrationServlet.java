package com.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.app.Employee;
import com.app.dao.EmployeeDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myserv")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public RegistrationServlet() {
        super();
            }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String Fname = request.getParameter("txtFirstname");
		String Lname = request.getParameter("txtLastname");
		String email = request.getParameter("txtemail");
		String age = request.getParameter("txtage");
		
		Employee e = new Employee();
		e.setFirstname(Fname);
		e.setLastName(Lname);
		e.setEmail(email);
		e.setAge(4);
		
		try {
		int status = EmployeeDAO.employeeRegistation(e);
		if(status == 1) {
			response.sendRedirect("login.html");
			}
		}catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
	}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
