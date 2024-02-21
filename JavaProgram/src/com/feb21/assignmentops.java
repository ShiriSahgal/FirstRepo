package com.feb21;

import java.util.Scanner;

public class assignmentops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		a%=b;
		System.out.println(a);
		
		//hardcoded
		/*int x=25,y=3;
		x%=y;
		System.out.println(x);*/

	}

}
