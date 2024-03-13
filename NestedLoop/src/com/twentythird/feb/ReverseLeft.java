package com.twentythird.feb;

import java.util.Scanner;

public class ReverseLeft {

	public static void main(String[] args) {
		/*int n,i,b,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row:");
		n= sc.nextInt();
		for (i=1;i<=n;i++) 
		{
			for (b=1;b<i;b++) 
			{
				System.out.print(" ");
			}
				for (j=1;j<=n+1-i;j++) 
				{
					System.out.print(" *");
				
				}
		}
		System.out.println();
		}
		*/

	int row=7;
	for(int i=row;i>=1;i--) 
	{
		for(int j=row;j>=i;j--) 
		{
			System.out.print(" ");
		}
	for (int k=1;k<=i;k++) 
	{
		System.out.print("*");
	}
	System.out.println();
	}
		
	}
}
