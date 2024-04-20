package com.eb.entity;

public class Menu {
private int menuId;
	
	private String menuName;
	
	private int prise;
	
	private int quantity;

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void show() {
		System.out.println("Menu Id:"+menuId+"\nMenu Name:"+
	
				menuName+"\nMenu prise:"+prise+"\nMenu Quantity:"+quantity);
	}
}