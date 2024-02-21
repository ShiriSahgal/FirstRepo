package com.feb21;

import java.util.Scanner;

public class TernoryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
		String res1=(a%2==0)?"Even":"Odd";
		System.out.println(res1);
		
		
		
		
		//hardcoded
		/*int num=5;
		String res=(num%2==0)?"Even":"Odd";
		System.out.println(res);*/

	}

}
