package com.edubridge.problemset;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Management System!!");
		int choice = 0;
		do {
			System.out.println("1.Employee has to enter Name:");
			System.out.println("2.Employee has to enter Designation:");
			System.out.println("3.Employee has to enter Specialization:");
			System.out.println("4.Exit");
			Scanner sc = new Scanner(System.in);
		
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter name:");
				String name=sc.next();
				System.out.println("Employee Name:"+name);
			break;
			case 2:
				System.out.println("Enter Designation:");
				String designation=sc.next();
				System.out.println("Employee Designation:"+designation);
				break;
			case 3:
				System.out.println("Enter Specialization:");
				String specialization=sc.next();
				System.out.println("Enter Specialization:"+specialization);
				break;
			case 4:
				System.out.println("Exit!");
				break;
			default:
				System.out.println("Wrong Input!!");
				break;
				
				
			}
		}while(choice!=4);

	}

}
