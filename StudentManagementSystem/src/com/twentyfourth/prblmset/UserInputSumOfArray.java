package com.twentyfourth.prblmset;

import java.util.Scanner;

public class UserInputSumOfArray {

	public static void main(String[] args) {
		// sum of array take elements and size fro user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int as = sc.nextInt();
		int arr[]=new int[as];
		System.out.println("Enter Array Elements:");
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("The Sum of array elements is :"+sum);

	}

}
