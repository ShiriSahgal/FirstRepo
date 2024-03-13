package com.twentyfourth.prblmset;

import java.util.Scanner;

public class UserInputReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int as = sc.nextInt();
		System.out.println("Enter Array Elements:");
		
		int ae[] = new int [as];
		System.out.print("Original Array:");
		for (int i=0;i<ae.length;i++) {
			
			ae[i]=sc.nextInt();
			
			System.out.print(ae[i]);
			}
		
		
		
	}

}
