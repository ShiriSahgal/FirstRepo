package com.miniproject2april.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection conn;
	public static Connection create() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/crud11221";;
			String username="root";
			String password="root";
			conn=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
		
	}
}
