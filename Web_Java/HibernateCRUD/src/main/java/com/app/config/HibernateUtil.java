package com.app.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.User;

public class HibernateUtil {
	private static SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(User.class).buildSessionFactory();

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		if (sessionFactory != null && !sessionFactory.isClosed()) {
			sessionFactory.close();
		}
	}
}
