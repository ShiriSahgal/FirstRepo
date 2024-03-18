package com.march18;

import java.util.ArrayList;



public class BookUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BookDetail>bd = new ArrayList<BookDetail>();
		
		BookDetail bd1 = new BookDetail(101,"I Don't Love You Any More.","Rithvik Singh",100);
		BookDetail bd2 = new BookDetail(102,"How To Finish Everything You Start.","Jan Yager",150);
		BookDetail bd3 = new BookDetail(103,"The Thousand Splendid Sun.","Khaled Hosseini",200);
		BookDetail bd4 = new BookDetail(104,"The Atomic Habbit","James Clear",100);
		BookDetail bd5 = new BookDetail(105,"The OSHO Man","Chandra Mohan Jain",350);
		
		bd.add(bd1);
		bd.add(bd2);
		bd.add(bd3);
		bd.add(bd4);
		bd.add(bd5);
		bd.forEach(i->{System.out.println(i);});

	}

}
