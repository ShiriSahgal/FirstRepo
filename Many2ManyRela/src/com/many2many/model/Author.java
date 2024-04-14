package com.many2many.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="Author")
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Auth_Id")
	private int authid;
	@Column(name="Auth_Name")
	private String authname;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Author_Book",joinColumns= {@JoinColumn(name="Auth_Id")},inverseJoinColumns={@JoinColumn(name="Book_Id")})
	private List<Book>book = new ArrayList<>();
	public int getAuthid() {
		return authid;
	}
	public void setAuthid(int authid) {
		this.authid = authid;
	}
	public String getAuthname() {
		return authname;
	}
	public void setAuthname(String authname) {
		this.authname = authname;
	}
	
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Author [authid=" + authid + ", authname=" + authname + "]";
	}
	public Author(String authname) {
		super();
		this.authname = authname;
		
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

}
