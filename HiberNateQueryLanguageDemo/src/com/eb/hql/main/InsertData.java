package com.eb.hql.main;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.eb.hql.entity.Student;




public class InsertData {
	public static void main(String[] args)  {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction tx = session.beginTransaction();
	Student student = new Student();
	student.setId(102);
	student.setName("Archana");
	student.setRoll("110");
	student.setPhone("7856235689");
	student.setDegree("BCA");
	
	student.setId(101);
	student.setName("Roshani");
	student.setRoll("120");
	student.setPhone("9321899353");
	student.setDegree("BSc");

	
	session.save(student);
	
	tx.commit();
	session.close();
}
}
