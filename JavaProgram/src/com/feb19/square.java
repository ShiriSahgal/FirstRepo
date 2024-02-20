package com.feb19;

import java.util.Scanner;

public class square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length :");
		int lgth = sc.nextInt();
		System.out.println("Enter breadth :");
		int brth = sc.nextInt();
		
		if (lgth==brth) {
			System.out.println("This is Square");
		}
		else{
			System.out.println("This is Rectangle");
		}
		

	}

}
