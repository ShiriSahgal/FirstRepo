package com.twentythird.feb;

import java.util.Scanner;

public class rightCornerTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Row :");
		int row = sc.nextInt();
		for (int i=1;i<=row;i++) {
			for(int j=2*(row-i);j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
		
	}
	

}
