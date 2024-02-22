package com.edubridge.problemset;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Student I'd:");
		int id = sc.nextInt();
		System.out.println("Enter Student Name:");
		String name = sc.next();
		System.out.println("Enter Subject1 Marks:");
		int m1 = sc.nextInt();
		System.out.println("Enter Subject2 Marks:");
		int m2 = sc.nextInt();
		System.out.println("Enter Subject3 Marks:");
		int m3 =  sc.nextInt();
		int total = (m1+m2+m3);
		double avg = (total/3);
		System.out.println("Student ID :"+id+"\nStudent Name:"+name+"\nTotal :"+total+"\nAverage:"+avg);
		if(avg>=90)
			System.out.println("A Grade");
		else if (avg>=75 && avg<90)
			System.out.println("B Grade");
		else if(avg>=55 && avg<75)
			System.out.println("C Grade");
		else if(avg>=35 && avg<55)
			System.out.println("D Grade");
		else 
			System.out.println("Fail");
		
		
		
		
		
		
		
		sc.close();
		

	}

}
