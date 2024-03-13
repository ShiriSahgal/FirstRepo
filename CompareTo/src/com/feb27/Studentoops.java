package com.feb27;

import java.util.Scanner;

class Sdnt
{
	String name;
	int age;
	void disp(String n, int a) {
		name = n;
		age = a;
		System.out.println("Student Name :"+name+"\nStudent Age:"+age);
	}
}

public class Studentoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		String str1 = sc.next();
		System.out.println("Enter Age");
		int age1 =sc.nextInt();
		System.out.println("Enter Name :");
		String str2 = sc.next();
		System.out.println("Enter Age");
		int age2 =sc.nextInt();
		Sdnt s1 = new Sdnt();
		s1.disp(str1,age1);
		s1.disp(str2,age2);

	}

}
