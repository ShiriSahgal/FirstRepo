package com.onetomany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ITEMS")
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
         private long id;
	@Column(name="item_id")
      private String itemId;
	
	@Column(name="item_total")
       private double itemTotal;

	@Column(name="quantity")
       private int quantity;

	@ManyToOne
	@JoinColumn(name="cart_id")
       private Cart cart;

	

	public long getId() {
		return id;
	}

	public Item(String itemId, double itemTotal, int quantity, Cart cart) {
		super();
		this.itemId = itemId;
		this.itemTotal = itemTotal;
		this.quantity = quantity;
		this.cart = cart;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public double getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
