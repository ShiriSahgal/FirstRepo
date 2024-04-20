package com.task.dao;

import java.sql.Connection;

import com.task.database.CP;
import com.task.pojo.Post;

public class PostDao {
	public static boolean createPost(Post p) {
		try {
			boolean f = false;
			Connection conn = CP.create(); 
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
		
	}
	 

}
