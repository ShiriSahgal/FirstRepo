package com.march19;

public class Product {
private int pid;
	
	private String pname;
	
	private int prise;
	
	private int qty;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", prise=" + prise + ", qty=" + qty + "]";
	}

	public Product(int pid, String pname, int prise, int qty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.prise = prise;
		this.qty = qty;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
