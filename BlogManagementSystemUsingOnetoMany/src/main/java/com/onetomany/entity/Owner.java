package com.onetomany.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Owner_Table")
public class Owner {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
@Column(name="name")
	private String name;
@Column(name="email")
	private String email;
	
@OneToMany(cascade=CascadeType.ALL,mappedBy="owner")
	private List<Blog>blogList;
	public Owner(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

}