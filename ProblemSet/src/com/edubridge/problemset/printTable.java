package com.edubridge.problemset;

import java.util.Scanner;

public class printTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print table:");
		int number = sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(number+"X"+i+"="+number*i);
			i++;
		}
		

	}

}
