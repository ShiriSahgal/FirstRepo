package com.march20;

public class Course {
	private int cid;
	private String cname;
	private int cduration;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String cname, int cduration) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cduration = cduration;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cduration=" + cduration + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCduration() {
		return cduration;
	}
	public void setCduration(int cduration) {
		this.cduration = cduration;
	}
}
