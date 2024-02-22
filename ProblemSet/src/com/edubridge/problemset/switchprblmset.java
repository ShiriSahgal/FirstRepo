package com.edubridge.problemset;
import java.util.Scanner;
public class switchprblmset {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Calculator System please enter opeartion of your choice :");
		System.out.println("Enter First Number:");
		int n1 = s.nextInt();
		System.out.println("Enter Second Number:");
		int n2 = s.nextInt();
		System.out.println("Enter Operation of your choice :");
		int choice = s.nextInt();
		switch (choice) {
		
		case 1 : 
			System.out.println("Addition:"+(n1+n2));
			break;
		case 2 : 
			System.out.println("Subtraction:"+(n1-n2));
			break;
		case 3 : 
			System.out.println("Multiplication:"+(n1*n2));
			break;
		case 4 : 
			System.out.println("Division:"+(n1/n2));
			break;
			
		default :
			System.out.println("You have enter Wrong Choice please choose appropriate operation number (1-Addition 2-Subtraction 3-Multiplication 4-Division)");
		}
		System.out.println("Thank You !! Visit Again");

	}
	
}
