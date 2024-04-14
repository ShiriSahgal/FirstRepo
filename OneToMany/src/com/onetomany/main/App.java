package com.onetomany.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.onetomany.model.Cart;
import com.onetomany.model.Item;

public class App {

	public static void main(String[] args) {

		Cart c1=new Cart();
		c1.setName("flipcart");
		//Items1( String itemId, double itemTotal, int quantity, Cart1 cart1) 
		//Items1( String itemId, double itemTotal, int quantity, Cart1 cart1) 
				Item i1=new Item("speaker101",1000,1,c1);
				Item i2=new Item("kurties",2000,3,c1);
				Item i3=new Item("shoose",2700,1,c1);
		
		Set<Item>itemset=new HashSet<Item>();
		itemset.add(i1);
		itemset.add(i2);
		itemset.add(i3);
		
		c1.setItem(itemset);
		c1.setTotal(11000*1+2000*3+2700*1);
		SessionFactory sessionFactory = null;
		Session session = null;
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.getCurrentSession();
 //create the session object
		session.beginTransaction();
		//create the transaction from the session object

		session.save(c1); 
		// save the vehicle entity to the database
		session.save(i1);
		session.save(i2);
		session.save(i3);
		// save the user entity to the database

		session.getTransaction().commit(); 
		//close the transaction
		session.close(); 
		
		
		
		
	}



	}


