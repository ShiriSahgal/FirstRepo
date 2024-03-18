package com.march15;

import java.util.ArrayList;
import java.util.Collections;

public class ProductNameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product>list1 = new ArrayList<Product>();
		list1.add(new Product(101, "Speaker", 7.9));
		list1.add(new Product(102, "Jeans", 8.9));
		list1.add(new Product(103, "Tshirt", 4.9));
		list1.add(new Product(104, "Leggi", 6.9));
		list1.add(new Product(105, "Monitor", 4.3));
		
		ProductName pn = new ProductName();
		Collections.sort(list1,pn);
		
		for(Product ls:list1) {
			System.out.println(ls.getPid()+" "+ls.getPname()+" "+ls.getPrating());
		}

	}

}
