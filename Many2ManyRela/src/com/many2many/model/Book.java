package com.many2many.model;

import javax.persistence.*;

@Entity
@Table(name="Book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Book_Id")
	private int bid;
	@Column(name="Book_Name")
	private String bname;
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
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}
	public Book(String bname) {
		super();
		this.bname = bname;
	}
	public Book() {
		super();

	}
	

}
