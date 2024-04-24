package com.onetomany.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="BLOG_INFO")
public class Blog {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	@Column(name="ID")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="category")
	private String category;
	

	@Column(name="content")
	private String content;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Owner owner;
	public Blog(String title, String category, String content) {
		super();
		this.title = title;
		this.category = category;
		this.content = content;
		
	}
}