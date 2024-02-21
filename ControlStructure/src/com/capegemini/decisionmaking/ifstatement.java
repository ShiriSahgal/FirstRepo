package com.capegemini.decisionmaking;

import java.util.Scanner;

public class ifstatement {

	public static void main(String[] args) {
		//hardcoded
		/*if(23<=4)
			System.out.println("True");
		System.out.println("False");*/
		//userinput
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1<=num2)
			System.out.println("True");
		System.out.println("False");
		

	}

}
