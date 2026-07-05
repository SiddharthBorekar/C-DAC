package com.app.dao;

import java.util.List;

import org.hibernate.Session;

import com.app.config.HibernateUtil;
import com.app.entity.User;

public class UserDao {
//	Add user
	public void addUser(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.persist(user);
		session.getTransaction().commit();
	}

//	Get all users
	public List<User> getAllUsers() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		List<User> list = session.createQuery("FROM User", User.class).list();
		session.getTransaction().commit();
		session.close();
		return list;
	}

//	Get user by id
	public User getUserById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		User user = session.get(User.class, id);

		session.getTransaction().commit();
		session.close();
		return user;
	}

//	Update User
	public void updateUser(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.merge(user);

		session.getTransaction().commit();
		session.close();
	}
	
//	delete user
	public void deleteUser(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		User user = session.get(User.class, id);
		if (user != null)
			session.remove(user);

		session.getTransaction().commit();
		session.close();
	}
}
