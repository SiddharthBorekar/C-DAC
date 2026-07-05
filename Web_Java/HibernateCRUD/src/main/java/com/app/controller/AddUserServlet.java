package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.app.dao.UserDao;
import com.app.entity.User;

@WebServlet("/users/add")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final UserDao userDao = new UserDao();

	public AddUserServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/views/add-user.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			User user = new User();
			user.setName(request.getParameter("name"));
			user.setEmail(request.getParameter("email"));
			userDao.addUser(user);
		} catch (Exception e) {
			request.setAttribute("error", "Could not add user: " + e.getMessage());
			request.getRequestDispatcher("/WEB-INF/views/add-user.jsp").forward(request, response);
			return;
		}
		response.sendRedirect(request.getContextPath() + "/users/list");
	}

}
