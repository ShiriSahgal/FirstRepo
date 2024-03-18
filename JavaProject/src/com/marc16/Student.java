package com.marc16;

public class Student {
	private int Sid;
	private String Sname;
	private String Sdiv;
	private int Sstd;
	private int Sage;
	private int Smarks;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSdiv() {
		return Sdiv;
	}
	public void setSdiv(String sdiv) {
		Sdiv = sdiv;
	}
	public int getSstd() {
		return Sstd;
	}
	public void setSstd(int sstd) {
		Sstd = sstd;
	}
	public int getSage() {
		return Sage;
	}
	public void setSage(int sage) {
		Sage = sage;
	}
	public int getSmarks() {
		return Smarks;
	}
	public void setSmarks(int smarks) {
		Smarks = smarks;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Sdiv=" + Sdiv + ", Sstd=" + Sstd + ", Sage=" + Sage
				+ ", Smarks=" + Smarks + "]";
	}
	public Student(int sid, String sname, String sdiv, int sstd, int sage, int smarks) {
		super();
		Sid = sid;
		Sname = sname;
		Sdiv = sdiv;
		Sstd = sstd;
		Sage = sage;
		Smarks = smarks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
