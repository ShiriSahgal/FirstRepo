package com.eb.hql.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.eb.hql.entity.Student;

public class ReadStudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		// Get All Employees
				Query query = session.createQuery("from Student");
				List<Student> list = (List<Student>) query.list();
				for (Student st : list) {
					System.out.println("List of Employees::" + st.getId() + ","
							+ st.getName() + "," + st.getDegree());
				}
				// Get Employee with id
				query = session.createQuery("from Student where id= :id");
				query.setLong("id", 101);
				Student stu = (Student) query.uniqueResult();
				System.out.println("Student Name=" + stu.getName() + ", Degre="
						+ stu.getDegree());
				tx.commit();
				session.close();
	}

}
