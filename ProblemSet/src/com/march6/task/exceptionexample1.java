package com.march6.task;

import java.util.Scanner;

public class exceptionexample1 {
	void show() throws exceptionexample{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age:");
		
		int age=sc.nextInt();
		
		if(age<18) {
			throw new exceptionexample("not eligible for voting");
		}
		else {
			System.out.println("eligible for voting");
		}
	}
public static void main(String[] args) {
		
	exceptionexample1 t=new exceptionexample1();
		
		try {
			t.show();
		} catch (exceptionexample e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}