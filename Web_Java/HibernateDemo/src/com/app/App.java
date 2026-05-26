package com.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Student;


public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. Get SessionFactory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//2. get Scession
		Session session = factory.openSession();	
		
		//3. Begin a transaction
		session.beginTransaction();
		//a. Persist Student
		Student S = new  Student();
		S.setFirstName("Siddharth");
		S.setLastName("Borekar");
		S.setEmail("siddhant@123");
		session.persist(S);
		
//		//b. Get student on basis of Id
//		System.out.println("Enter ID: ");
//		int id = sc.nextInt();
//		Student student = session.get(Student.class,id);
//		System.out.println(student);
//		
//		//c. Update Statement
//		System.out.println("Enter ID :");
//		int id1 = sc.nextInt();
//		Student Student = session.get(Student.class,id);
//		Student.setEmail("Sid@123");
//		System.out.println(Student);
//		
//		//d. Delete Ststement
//		System.out.println("Enter ID : ");
//		int id2 = sc.nextInt();
//		Student student1 = session.get(Student.class,id);
//		session.remove(student1);
		
		
		//HQL "Hibernte Query Language"
		
//		Query <Student> query =  session.createQuery("FROM Student");
//		List <Student> list = query.list();
//		list.forEach(x -> System.out.println(x));
//		
//		List<Student> list1 = session.createQuery("From Student").list();
//		list.forEach(x -> System.out.println(x));
//		
//		Query <Student> query1 = session.createQuery("from Student Where lastName = :name");
//		query.setParameter("name", "Siddharth");
//		List <Student> list2 = query1.list();
//		list.forEach(x -> System.out.println(x));
		
		
		//4. Commit transaction
		session.getTransaction().commit();
		
		//5. Close the session
		session.close();
		
		//6. close the factory
		factory.close();
		
	}
}
