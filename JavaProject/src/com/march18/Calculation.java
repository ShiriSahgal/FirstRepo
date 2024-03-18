package com.march18;
interface Calculation1{
	public void findsquare(int no);
}
public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation1 c1=(int no)->System.out.println(no*no);
		c1.findsquare(10);
	}
 
}
