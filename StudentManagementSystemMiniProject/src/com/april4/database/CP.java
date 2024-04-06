package com.april4.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection conn;
	public static Connection create() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/miniproject";
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


