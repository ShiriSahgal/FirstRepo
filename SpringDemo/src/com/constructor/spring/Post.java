package com.constructor.spring;

public class Post {
private int postId;
	
	private String postName;
	
	private String postComment;

	public Post(int postId, String postName, String postComment) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.postComment = postComment;
	}

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void disp() {
		System.out.println("Post Id:"+postId+"\nPost Name:"+postName+"\nPost Comment"+postComment);
	}

}
