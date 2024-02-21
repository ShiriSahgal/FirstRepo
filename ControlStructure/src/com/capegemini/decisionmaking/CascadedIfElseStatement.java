package com.capegemini.decisionmaking;

import java.util.Scanner;

public class CascadedIfElseStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		System.out.println("Enter Second Number:");
		System.out.println("Enter Third Number:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1>num2 && num1>num3)
			System.out.println("First Number is Larger");
		else if(num2>num1 && num2>num3)
			System.out.println("Second Number is Larger");
		else
			System.out.println("Third Number is Larger");
		sc.close();

	}

}
