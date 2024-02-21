package com.capegemini.decisionmaking;

import java.util.Scanner;

public class ifelsestatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
		System.out.println("Enter weight:");
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if (age>=18 && weight>=45)
		{
			System.out.println("You are eligible to donate blood !!");
		}
		else {
			System.out.println("You are not eligible to donate blood !!");
		}
		sc.close();
		//before closing it shows a yellow line to remove close the scanner class

	}
	

}
