package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Book;

public class BookDAO {
	
	private static SessionFactory sessionFactory = null;
	private static Session session = null;
	
	public static Session getSession()
	{
		sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Book.class)
				.buildSessionFactory();
		session = sessionFactory.openSession();
		return session;
	}
	
	public static int saveBook(Book b)
	{
		System.out.println(b);
		
		session = getSession();
		session.beginTransaction();
		int i = (int) session.save(b);
		System.out.println(i);
		session.getTransaction().commit();
		destroy();
		return i;
	}
	
	public static List<Book> getAllBooks()
	{
		session = getSession();
		session.beginTransaction();
		List<Book> list =  session.createQuery("from Book",Book.class).getResultList();
		destroy();
		return list;
	}
	
	public static Book getBookById(int id)
	{
		session = getSession();
		session.beginTransaction();
		Book book = session.get(Book.class,id);
		System.out.println(book);
		destroy();
		return book;
	}
	
	public static int updateBook(Book b)
	{
		Book book = null;
		session = getSession();
		session.beginTransaction();
		book =  session.merge(b);
		System.out.println("Update - "+book);
		session.getTransaction().commit();
		destroy();
		return book.getId();
	}
	
	
	public static void destroy()
	{
		session.close();
		sessionFactory.close();
	}

}
