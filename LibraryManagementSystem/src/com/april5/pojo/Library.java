package com.april5.pojo;

public class Library {
	private int booid;
	private String bookName;
	private String authName;
	private String publishDate;
	private String price;
	private String qty;
	public int getBooid() {
		return booid;
	}
	public void setBooid(int booid) {
		this.booid = booid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Library [booid=" + booid + ", bookName=" + bookName + ", authName=" + authName + ", publishDate="
				+ publishDate + ", price=" + price + ", qty=" + qty + "]";
	}
	public Library(String bookName, String authName, String publishDate, String price, String qty) {
		super();
		
		this.bookName = bookName;
		this.authName = authName;
		this.publishDate = publishDate;
		this.price = price;
		this.qty = qty;
	}
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
