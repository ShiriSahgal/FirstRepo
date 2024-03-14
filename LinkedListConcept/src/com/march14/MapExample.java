package com.march14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String>h1=new HashMap<Integer,String>();
		
		h1.put(101, "Sagar");
		h1.put(101, "Shalini");
		h1.put(104, "Adi");
		h1.put(103, "Sujay");
		h1.put(102, "Ajay");
		
		System.out.println(h1);
	LinkedHashMap<Integer,String>h2=new LinkedHashMap<Integer,String>();
		
		h2.put(101, "Sagar");
		h2.put(103, "Shalini");
		h2.put(104, "Adi");
		h2.put(105, "Sujay");
		h2.put(102, "Ajay");
		
		System.out.println(h2);
	TreeMap<Integer,String>h3=new TreeMap<Integer,String>();
		
		h3.put(101, "Sagar");
		h3.put(103, "Shalini");
		h3.put(104, "Adi");
		h3.put(105, "Sujay");
		h3.put(102, "Ajay");
		
		System.out.println(h3);	
		// loop mai wo key value ko show krne ke liye
		Iterator<Map.Entry<Integer,String>>i1=h3.entrySet().iterator();
		while(i1.hasNext()) {
			Map.Entry<Integer, String>m1=(Map.Entry<Integer, String>)i1.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			}

	}

}
