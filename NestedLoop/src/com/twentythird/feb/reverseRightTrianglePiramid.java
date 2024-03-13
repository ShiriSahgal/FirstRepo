package com.twentythird.feb;

import java.util.Scanner;

public class reverseRightTrianglePiramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows:");
		int row = sc.nextInt();
		for (int i = row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				//System.out.print(row);
				//System.out.print(i);
				//System.out.print(j);
			}
			System.out.println();
		}
	}

}
