package com.april5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.april5.database.CP;
import com.april5.pojo.Library;

public class LibraryDao {
	public static boolean insertBook(Library l) {
		try {
			boolean f = false;
			Connection conn =  CP.create();
			String query = "insert into libraryinfo(bname,authname,pubdate,prise,quantity)values(?,?,?,?,?)";
			PreparedStatement p = conn.prepareStatement(query);
			p.setString(1, l.getBookName());
			p.setString(2, l.getAuthName());
			p.setString(3, l.getPublishDate());
			p.setString(4, l.getPrice());
			p.setString(5, l.getQty());
			p.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	return false;
		
	}
	public static boolean updateLibararyBook(int val , String toUpdate,int id, Library l) {
		boolean f = false;
		try {
			Connection conn = CP.create();
			if(val == 1) {
				String query = "update libraryinfo set bname=? where bid = ?";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}
			else if(val==2) {
				String query = "update libraryinfo set authname=? where bid=? ";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
				
			}
			else if (val==3) {
				String query = "update libraryinfo set pubdate=? where bid=? ";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}
			else if(val==4) {
				String query = "update libraryinfo set prise=? where bid =?";
				PreparedStatement ps= conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				ps.executeUpdate();
				f=true;
			}
			else if(val==5) {
				String query = "update libraryinfo set quantity=? where bid=? ";
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
	public static void showAllBook() {
		boolean f = false;
		try {
			Connection conn = CP.create();
			String query = "select * from libraryinfo";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				int id = rs.getInt(1);
				String bookName = rs.getString(2);
				String authName =rs.getString(3);
				String publishDate =rs.getString(4);
				String price = rs.getString(5);
				String qty = rs.getString(6);
				System.out.println("Book Id:"+id+"\nBook Name:"+bookName+"\nAuthor Name:"+authName+"\nPublish Date:"+publishDate+"\nPrice:"+price+"\nQuantity:"+qty);
				System.out.println("-----------------------------------------------------");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean deleteBook(int id) {
		boolean f = false;
		try {
			Connection conn = CP.create();
			String query ="delete from libraryinfo where bid =? ";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			f=true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	

}
