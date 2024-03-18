package com.march15;

import java.util.ArrayList;
import java.util.Collections;

public class Product {
	private int pid;
	private String pname;
	private double prating;

	public Product(int pid, String pname, double prating) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.prating = prating;
	}

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

	public double getPrating() {
		return prating;
	}

	public void setPrating(double prating) {
		this.prating = prating;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product>list1 = new ArrayList<Product>();
		
		list1.add(new Product(101, "Speaker", 7.9));
		list1.add(new Product(102, "Jeans", 8.9));
		list1.add(new Product(103, "Tshirt", 4.9));
		list1.add(new Product(104, "Leggi", 6.9));
		list1.add(new Product(105, "Monitor", 4.3));
		ProductRating pr=new ProductRating();
		Collections.sort(list1,pr);
		for(Product p:list1) {
			System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrating());
		}
	}

}
