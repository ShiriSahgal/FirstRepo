package com.march13;

import java.util.ArrayList;
import java.util.List;



public class CollectionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l1 =new ArrayList<Integer>();
		l1.add(30);
		l1.add(20);
		l1.add(10);
		l1.add(50);
		l1.add(40);
		System.out.println(l1);
		System.out.println(l1.get(4));
		System.out.println(l1.indexOf(40));
		

	}

}
