package com.feb19;

import java.util.Scanner;

public class voting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String name = sc.nextLine();
		System.out.println("Enter Your Age:");
		int age= sc.nextInt();
		
		if(age>=21) {
			System.out.println("You are eligible for voting");
		}
		else {
			System.out.println("You are age does not meet to age criteria");
		}

	}

}
