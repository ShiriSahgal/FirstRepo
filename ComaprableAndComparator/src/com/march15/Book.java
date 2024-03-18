package com.march15;

public class Book {
	private int bid;
	public Book(int bid, String bname, String bAuther, int bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bAuther = bAuther;
		this.bprice = bprice;
	}
	private String bname;
	private String bAuther;
	private int bprice;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getbAuther() {
		return bAuther;
	}
	public void setbAuther(String bAuther) {
		this.bAuther = bAuther;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}

}
