package com.april4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.april4.database.CP;
import com.april4.pojo.Student;

public class StudentDao {
	public static boolean createStudent(Student s) {
		try {
			boolean f = false;
			Connection conn = CP.create();
			String query = "insert into student(sname,sphone,scity)values(?,?,?)";
			PreparedStatement p = conn.prepareStatement(query);
			p.setString(1, s.getStudentName());
			p.setString(2, s.getStudentPhone());
			p.setString(3, s.getStudentCity());
			p.executeUpdate();
			f= true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	public static boolean updateStudentData(int val,String toUpdate,int id,Student s) {
		boolean f = false;
		try {
			Connection  conn = CP.create();
			if(val==1) {
				String query = "update Student set sname=? where sid=? ";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
				
			}
			else if(val==2) {
				String query = "update Student set sphone=? where sid=?";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}
			else if(val==3) {
				String query = "update Student set scity=? where sid=?";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}
			else {
				System.out.println("No Updation!!!");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
		
		public static void showAllData() {
			boolean f = false;
			try {
				Connection conn = CP.create();
				String query = "select * from Student";
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(query);
				while(rs.next()) {
					int id = rs.getInt(1);
					String studentName = rs.getString(2);
					String studentPhone = rs.getString(3);
					String studentCity =  rs.getString(4);
					System.out.println("Student Id:"+id+"\nStudent Name:"+studentName+
							"\nStudent Contact Number:"+studentPhone+"\nStudent City:"+studentCity);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}
		public static boolean deleteMenu(int id) {
			boolean f =  false;
			try {
				Connection conn=CP.create();
				String query="delete from Student where sid=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setInt(1, id);
				ps.executeUpdate();
				f=true;
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return false;
			
		}
	
}
