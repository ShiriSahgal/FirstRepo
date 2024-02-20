package com.feb19;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int i = sc.nextInt();
		
		if(i%2==0) {
			System.out.println("The Number is Even Number:");
		
		}
		else {
			System.out.println("The Number is Odd Number:");
		}
	}

}
