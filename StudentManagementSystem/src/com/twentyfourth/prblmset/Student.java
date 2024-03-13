package com.twentyfourth.prblmset;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		System.out.println("Welcome to Student Management System !!!");
		int choice = 0;
		do {
			System.out.println("Student Info (press 1):");
			System.out.println("Student Course Rating (press 2):");
			System.out.println("Student Eligibility (press 3):");
			System.out.println("Exit!!!");
			System.out.println("Enter Chocice:");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("Enter Student Name :");
				String name = sc.next();
				System.out.println("Enter Student Age :");
				int age = sc.nextInt();
				System.out.println("Enter Student Address :");
				String add = sc.next();
				System.out.println("Student Info");
				System.out.println("Student Name :"+name+"\nStudent Age : "+age+"\nStudent Address:"+add);
			break;
			case 2 :
				System.out.println("Enter Course Rating :");
				double rate = sc.nextDouble();
				if (rate<=4.5)
					System.out.println("Good");
				else 
					System.out.println("Need To Improve");
			break;
			case 3:
				System.out.println("Enter Student Attendance :");
				int sa = sc.nextInt();
				if (sa>=50) 
					System.out.println("Student is Eligible for placement");
				else
					System.out.println("Not Eligible for Placement.");
			break;
			case 4:
				System.out.println("Thanks For Visiting Our Student Management System!! ");
				System.out.println("Visit Again !!! ");
			break;
			default:
				System.out.println("Enter Appropriate Choice....");
				break;
				
				
				}
			
		}while(choice!=4);
		
		
		

	}

}
