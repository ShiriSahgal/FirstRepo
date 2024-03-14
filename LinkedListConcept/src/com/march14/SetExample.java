package com.march14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>h1 = new HashSet<String>();
		h1.add("Roshani ");
		h1.add("Sahu");
		h1.add("Eco");
		System.out.println(h1);
		LinkedHashSet<String>h2 = new LinkedHashSet<String>();
		h2.add("Roshani ");
		h2.add("Sahu");
		h2.add("Eco");
		System.out.println(h2);
		TreeSet<String>h3 = new TreeSet<String>();
		h3.add("Roshani ");
		h3.add("Sahu");
		h3.add("Eco");  
		System.out.println(h3);
		
HashSet<String>h4=new HashSet<String>();
		
h4.add("red");
h4.add("black");
h4.add("red");
h4.add("brown");
h4.add("white");
		
		System.out.println(h4);
		
LinkedHashSet<String>h5=new LinkedHashSet<String>();
		
h5.add("red");
h5.add("black");
h5.add("red");
h5.add("brown");
		h5.add("white");
		
		System.out.println(h5);
		
TreeSet<String>h6=new TreeSet<String>();
		
h6.add("red");
		h6.add("black");
		h6.add("red");
		h6.add("brown");
		h6.add("white");
		
		System.out.println(h6);
	}

}
