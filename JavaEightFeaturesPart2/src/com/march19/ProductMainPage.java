package com.march19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMainPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product>l1=new ArrayList<Product>();
		Product p1=new Product(101,"speakers",2000,2);
		Product p2=new Product(105,"Tshirt",500,1);
		Product p3=new Product(102,"Mouse",1000,3);
		Product p4=new Product(104,"Cooling pad",6000,2);
		Product p5=new Product(103,"bag",500,1);
	    l1.add(p1);
	    l1.add(p2);
	    l1.add(p3);
	    l1.add(p4);
	    l1.add(p5);
	    
	    List<Product>l2=l1.stream().map(x->x).collect(Collectors.toList());
	    System.out.println(l2);
	    List<Product>l3=l1.stream().filter(x->x.getPrise()>500).collect(Collectors.toList());
	    System.out.println(l3);
	
	
	}

}
