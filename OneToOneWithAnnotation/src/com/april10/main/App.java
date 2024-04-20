package com.april10.main;

import org.hibernate.Session;

import com.april10.model.Customer;
import com.april10.model.Product;



public class App {

	public static void main(String[] args) {
		System.out.println("Hibernate one to one XML Mapping");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Customer  c1 = new Customer();
		Product p1=new Product();
		
		
		c1.setCustName("Ajay Gupta");
		
		c1.setCustAddress("Mumbai");
		
		c1.setEmail("Ajya@gmail.com");
		c1.setProduct(p1);
		
		c1.setContactno("9823569862");
		p1.setPname("Speakers");
		p1.setPrise(2000);
		p1.setQty(2);
		
		p1.setCustomer(c1);
		
		session.save(c1);
		
		session.getTransaction().commit();
		session.close();
		
		
	}

}
