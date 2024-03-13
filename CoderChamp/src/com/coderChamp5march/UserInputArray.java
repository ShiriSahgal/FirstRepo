package com.coderChamp5march;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int size = sc.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter Array Elements:");
		for(int i =0; i<size ; i++) {
			array[i]= sc.nextInt();
		}
		System.out.println("Elements of the array :");
		for(int i =0; i<size ; i++) {
			System.out.println(array[i]);
		}
		 System.out.println("Reverse Array :");
		 for (int i = size - 1; i >= 0; i--) {
		            System.out.println(array[i]);
		        }
	}

}
