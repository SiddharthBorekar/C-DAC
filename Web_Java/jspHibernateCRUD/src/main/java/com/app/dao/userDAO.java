package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.User;

public class userDAO {
	public static SessionFactory sessionFactory = null;
	public static Session session = null;

	public static Session getSession() {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.buildSessionFactory();
		session = sessionFactory.openSession();
		return session;
	}
}
