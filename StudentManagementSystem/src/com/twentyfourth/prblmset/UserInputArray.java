package com.twentyfourth.prblmset;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int as=sc.nextInt();
		int arr[]=new int[as];
		System.out.println("Enter Array Element:");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements:");
		 	for(int i=0;i<arr.length;i++) {
		 		System.out.println("{"+arr[i]+"}"+",");
		 	}
		 
		

	}

}
