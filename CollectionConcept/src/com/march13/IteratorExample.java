package com.march13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Apple");
		a1.add("Mango");
		a1.add("Banana");
		a1.add("Strawberry");
		a1.add("Kiwi");
		System.out.println(a1);
		System.out.println(a1.indexOf("Banana"));
		System.out.println(a1.lastIndexOf("Banana"));
		Collections.sort(a1);
		System.out.println(a1);
		
		Iterator itr = a1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Using For Loop");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i ));
		}
	}

}
