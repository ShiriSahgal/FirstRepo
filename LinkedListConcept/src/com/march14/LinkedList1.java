package com.march14;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>l1 = new LinkedList<String>();
		
		l1.add("Roshani");
		l1.add("Huda");
		l1.add("Abhay");
		l1.add("Kavita");
		System.out.println(l1);
		LinkedList<String>l2 = new LinkedList<String>();
		l2.add("Amisha");
		l2.add("Asha");
		l1.addAll(l2);
		System.out.println(l1);
		l1.addFirst("Keadar");
		System.out.println(l1);
		l1.addLast("Archana");
		System.out.println(l1);
		l1.add(3, "Roshani");
		System.out.println(l1);
		l1.set(2, "Sahgal");
		System.out.println(l1);
	}

}
