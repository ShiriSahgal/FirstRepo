package com.feb19;
import java.util.Scanner;
public class greatestnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number :");
		int num2 = sc.nextInt();
		
		if (num1> num2) {
			System.out.println("The greatest number is :"+num1);
		}
		else {
			System.out.println("The lowest number is :"+num2);
		}

	}

}
