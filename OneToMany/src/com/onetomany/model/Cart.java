package com.onetomany.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CART")
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private long id;
	@Column(name="total")
	private double total;
	@Column(name="name")
	private String name;
	@OneToMany(mappedBy="cart")
	private Set<Item>item;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Item> getItem() {
		return item;
	}
	public void setItem(Set<Item> item) {
		this.item = item;
	}
	
	

}
