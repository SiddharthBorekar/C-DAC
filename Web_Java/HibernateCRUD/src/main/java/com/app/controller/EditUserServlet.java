package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.app.dao.UserDao;
import com.app.entity.User;

@WebServlet("/users/edit")
public class EditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final UserDao userDao = new UserDao();

	public EditUserServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		User user = userDao.getUserById(id);
		request.setAttribute("user", user);

		request.getRequestDispatcher("/WEB-INF/views/edit-user.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setName(name);

		userDao.updateUser(user);
		response.sendRedirect(request.getContextPath() + "/users/list");
	}
}
