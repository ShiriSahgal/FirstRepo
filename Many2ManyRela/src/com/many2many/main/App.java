package com.many2many.main;

import org.hibernate.Session;

import com.many2many.model.Author;
import com.many2many.model.Book;

public class App {
	public static void main(String[] args) {
		Book b1 = new Book("C Programming");
		Book b2 = new Book("Java");
		Book b3 = new Book("Atomic Habbit");
		
		Author a1 = new Author("Chinmay Sawant");
		Author a2 = new Author("John Dao");
		a1.getBook().add(b1);
		a2.getBook().add(b3);
		a1.getBook().add(b2);
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.persist(a1);
		session.persist(a2);
		session.persist(a1);
		
		session.getTransaction().commit();
	}

}
