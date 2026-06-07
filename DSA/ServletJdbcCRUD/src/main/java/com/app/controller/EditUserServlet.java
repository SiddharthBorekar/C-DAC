package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import com.app.dao.UserDao;
import com.app.model.User;

@WebServlet("/users/edit")
public class EditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final UserDao userDao = new UserDao();

	public EditUserServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User lookup = new User();

		lookup.setId(Integer.parseInt(request.getParameter("id")));

		try {
			User user = userDao.getUserById(lookup);
			request.setAttribute("user", user);
		} catch (ClassNotFoundException | SQLException e) {
			throw new ServletException("Failed to load the user: " + e.getMessage(), e);
		}
		request.getRequestDispatcher("/WEB-INF/views/edit-user.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		user.setId(Integer.parseInt(request.getParameter("id")));
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));

		try {
			userDao.updateUser(user);
		} catch (ClassNotFoundException | SQLException e) {
			throw new ServletException("Failed to update the user: " + e.getMessage(), e);
		}
		response.sendRedirect(request.getContextPath() + "/users/list");
	}

}
