package com.feb19;

import java.util.Scanner;

public class maths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number :");
		int num1 =sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int num2 =sc.nextInt();
		
		System.out.println("Addition of the number:"+(num1+num2)+
				"\nMultiplication of the number"+(num1*num2));

	}

}
