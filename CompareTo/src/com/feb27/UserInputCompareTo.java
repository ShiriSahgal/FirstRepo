package com.feb27;

import java.util.Scanner;

public class UserInputCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1:");
		String str1=sc.next();
		System.out.println("Enter String 2:");
		String str2 = sc.next();
		System.out.println("Output:");
		System.out.println(str1.compareTo(str2));

	}

}
