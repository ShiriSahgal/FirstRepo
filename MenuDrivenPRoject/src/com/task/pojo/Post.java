package com.task.pojo;

public class Post {
	private int pid;
	private String pname;
	private String comment;
	private String pdate;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	@Override
	public String toString() {
		return "Post [pid=" + pid + ", pname=" + pname + ", comment=" + comment + ", pdate=" + pdate + "]";
	}
	public Post(int pid, String pname, String comment, String pdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.comment = comment;
		this.pdate = pdate;
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
