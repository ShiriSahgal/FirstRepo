package com.manytomany.main;

import org.hibernate.Session;

import com.manytomany.model.Student;
import com.manytomany.model.Subject;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student("Roshani","Sahu");
		Student s2 = new Student("Huda","Siddiqui");
		Student s3 = new Student("Kavita","Sahu");
		Student s4 = new Student("Sayali","Sawant");
		Student s5 = new Student("Sahil","Sawant");
		
		Subject sb1 = new Subject("Java");
		Subject sb2 = new Subject("HTML");
		Subject sb3 = new Subject("CSS");
		Subject sb4 = new Subject("JavaScript");
		Subject sb5 = new Subject("JAP  & Hibernate");
		
		//Student1
		s1.getSubjects().add(sb1);
		s1.getSubjects().add(sb2);
		s1.getSubjects().add(sb5);
		
		//student2
		s2.getSubjects().add(sb3);
		s2.getSubjects().add(sb4);
		
		//student3
		s3.getSubjects().add(sb1);
		s3.getSubjects().add(sb2);
		s3.getSubjects().add(sb3);
		s3.getSubjects().add(sb4);
		s3.getSubjects().add(sb5);
		
		//student4
		s4.getSubjects().add(sb2);
		
		//student5
		s5.getSubjects().add(sb4);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(s1);
		session.persist(s2);
		session.persist(s3);
		session.persist(s4);
		session.persist(s5);
		session.getTransaction().commit();
	}

}
