package com.feb19;

import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Name:");
		String pname = sc.nextLine();
		
		System.out.println("Enter Product Quantity:");
		int pqty = sc.nextInt();
		
		System.out.println("Enter Product Price:");
		int prc = sc.nextInt();
		
		System.out.println("Product Name:"+pname+"\nProduct Quantity:"+pqty+"\nProduct Price:"+prc);

	}

}
