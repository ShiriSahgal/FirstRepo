package com.april3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.miniproject2april.menu;
import com.miniproject2april.database.CP;


public class MenuDao {

	public static boolean createMenu(menu m) {
		try {
			boolean f = false;
			Connection conn = CP.create();
			String query = "insert into menu(menuname,menutype,prise,quantity)values(?,?,?,?)";
			PreparedStatement p = conn.prepareStatement(query);
			p.setString(1, m.getMenuName());
			p.setString(2, m.getMenuType());
			p.setInt(3, m.getPrise());
			p.setInt(4, m.getQuantity());
			p.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			
			
		}
		return false;
		
	}
	public static boolean updateMenuData(int val,String toUpdate,int id,menu m)
	{
		boolean f= false;
		try {
			Connection conn = CP.create();
			if (val==1) {
				String query = "update menu set menuname=? where menuid=?";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1,toUpdate);
				ps.setInt(2,id);
				ps.executeUpdate();
				f=true;
			}
			else if (val==2) {
				String query = "update menu set menutype=? where menuid=?";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1,toUpdate);
				ps.setInt(2,id);
				ps.executeUpdate();
				f=true;
			}
			else if (val==3) {
				String query = "update menu set prise=? where menuid=?";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1,toUpdate);
				ps.setInt(2,id);
				ps.executeUpdate();
				f=true;
			}
			else if (val==4) {
				String query = "update menu set quantity=? where menuid=?";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1,toUpdate);
				ps.setInt(2,id);
				ps.executeUpdate();
				f=true;
			}
			else {
				System.out.println("No Updation!!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	public static void showAllMenus() {
		boolean f = false;
		try {
			Connection conn = CP.create();
			String query = "Select * from menu";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				int id = rs.getInt(1);
				String menuname = rs.getString(2);
				String menutype = rs.getString(3);
				int prise = rs.getInt(4);
				int quantity = rs.getInt(5);
				System.out.println("Menu Id:"+id+"\nMenu Name:"+menuname+
						"\nMenu Type:"+menutype+"\nMenu Prise:"+prise+"\nMenu quantity:"+quantity);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean deleteMenu(int menuid) {
		boolean f=false;
		try {
			Connection conn=CP.create();
			String query="delete from menu where menuid=?";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1, menuid);
			ps.executeUpdate();
			f=true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
	

