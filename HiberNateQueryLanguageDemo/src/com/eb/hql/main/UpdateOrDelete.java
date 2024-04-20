package com.eb.hql.main;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateOrDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		/*Query query = session
			.createQuery("update Student set name= :name where id= :id");
		query.setString("name", "Amit Raj");
		query.setLong("id", 101);
		int result = query.executeUpdate();
		System.out.println("Student data Update Status=" + result);*/

		// Delete Employee, we need to take care of foreign key constraints too
		Query query = session.createQuery("delete from Student where id= :id");
		query.setLong("id", 102);
		int result = query.executeUpdate();
		System.out.println("Student Data Delete Status=" + result);

		tx.commit();
		session.close();
	}

}
