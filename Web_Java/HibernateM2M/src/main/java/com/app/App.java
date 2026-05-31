package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();

		Course c1 = new Course("Microserveses");
		Course c2 = new Course("Python");
		Course c3 = new Course("Java");
		Course c4 = new Course("Web dev");
		session.persist(c1);
		session.persist(c2);
		session.persist(c3);
		session.persist(c4);

		Student S = new Student();
		S.setFirstName("Sidd");
		S.setLastName("Borekar");
		S.setEmail("Sidd@123");

		S.add(c1);
		S.add(c2);
		S.add(c3);
		S.add(c4);

		session.persist(S);
		session.getTransaction().commit();
		session.close();
		factory.close();

	}
}
