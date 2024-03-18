package com.march15;

import java.util.Hashtable;
import java.util.Map;

public class BookHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,Book>ht = new Hashtable<Integer,Book>();
		
		Book b1 = new Book(101,"I Don't Love You Any More.","Rithvik Singh",100);
		Book b2 = new Book(102,"How To Finish Everything You Start.","Jan Yager",150);
		Book b3 = new Book(103,"The Thousand Splendid Sun.","Khaled Hosseini",200);
		Book b4 = new Book(104,"The Atomic Habbit","James Clear",100);
		Book b5 = new Book(105,"The OSHO Man","Chandra Mohan Jain",350);
		
		 ht.put(101,b1);
		 ht.put(102,b2);
		 ht.put(103,b3);
		 ht.put(104,b4);
		 ht.put(105,b5);
		 
		 System.out.println("Book Details:");
		 for(Map.Entry<Integer,Book> book:ht.entrySet()){
			 
			 int key = book.getKey();
			 Book b = book.getValue();
			 System.out.println("_____________________________");
			 
			System.out.println("Book Id:"+b.getBid()+"\nBook Name:"+b.getBname()+"\nBook Author:"+b.getbAuther()+"\nBook Price:"+b.getBprice());
		 }

	}

}
