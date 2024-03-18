package com.march15;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al = new ArrayList<String>();
		al.add("Red");
		al.add("Blue");
		al.add("Pink");
		al.add("Brown");
		al.add("Green");
		al.add("Yellow");
		System.out.println(al);
		for (String i:al) {
			System.out.println(i);
		}
	}

}
