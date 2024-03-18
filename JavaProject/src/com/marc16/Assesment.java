package com.marc16;

import java.util.Scanner;

public class Assesment {
	static void pattern(int num)
	{
		for(int i=1;i<=num;i++)
		{
			for(int k=i+1;k<=num;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows for first pattern:");
		num1 = sc.nextInt();
		System.out.println("Enter rows for second pattern:");
		num2 = sc.nextInt();
		System.out.println("Enter rows for Third pattern:");
		num3 = sc.nextInt();
		
		pattern(num1);
		pattern(num2);
		pattern(num3);

	}

}
