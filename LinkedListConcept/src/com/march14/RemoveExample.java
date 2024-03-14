package com.march14;

import java.util.LinkedList;

public class RemoveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>l11=new LinkedList<String>();
		l11.add("Ramesh");
		l11.add("Ajay");
		l11.add("Raju");
		l11.add("Amit");
		l11.add("Rishabh");
		l11.add("Madhu");
		System.out.println(l11);
		l11.remove();
		System.out.println(l11);
		l11.removeLast();
		System.out.println(l11);
		
		l11.add("Roshani");
		l11.add("Sahu");
		System.out.println(l11);
		l11.removeFirst();
		System.out.println(l11);
		l11.add("Roshani");
		l11.add("Sahu");
		l11.add("Roshani");
		l11.add("Sahu");
		l11.add("Roshani");
		l11.add("Sahu");
		System.out.println(l11);
		l11.removeFirstOccurrence(l11);
		System.out.println(l11);
		l11.removeLastOccurrence(l11);
		System.out.println(l11);
		l11.clear();
		System.out.println(l11);
		

	}

}
