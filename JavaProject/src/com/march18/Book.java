package com.march18;
@FunctionalInterface
interface book1 {
	public void show(int Bookid);
}
interface book2{
	public void show(String Bookname);
}
interface book3{
	public void show(int Bookprice);
}
interface book4{
	public void show(int Bookqty);
}
public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book1 b1 = (int Bookid)->System.out.println("Book Id:"+Bookid);
		b1.show(101);
		book2 b2 = (String Bookname)->System.out.println("Book Name:"+Bookname);
		b2.show("The Atomic Habits");
		book3 b3 = (int Bookprice)->System.out.println("Book Price:"+Bookprice);
		b3.show(100);
		book4 b4 = (int Bookqty)->System.out.println("Book Name:"+Bookqty);
		b4.show(4);
		
	}

}
