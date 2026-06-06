package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.app.dao.UserDao;
import com.app.model.User;

@WebServlet("/users/add")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final UserDao userDao = new UserDao();

	public AddUserServlet() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/add-user.jsp").forward(req, res)
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = new User();

		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));

		try {
			userDao.addUser(user);
		} catch (Exception e) {
			throw new ServletException(e);
		}
		response.sendRedirect(request.getContextPath() + "/users/list");
	}
}
