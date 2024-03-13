package com.march6.task;

import java.util.Scanner;

public class Task1 {
	void show() throws Task{
		Scanner s = new Scanner(System.in);
		System.out.println("enter number:");
		int num =s.nextInt();
		
		if (num<0) {
			throw new Task("Number is Negative Number");
		}
		else {
			System.out.println("Number is Positive Number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 t1 = new Task1();
		 try {
			 t1.show();
			 
		 }
		 catch(Task e) {
			 e.printStackTrace();
		 }

	}

}
