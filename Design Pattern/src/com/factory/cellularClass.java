package com.factory;

import java.util.Scanner;

public class cellularClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SelectNetworkPlan s2=new SelectNetworkPlan();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the network for which u want generate bill");
		String networkName=sc.next();
		
		System.out.println("enter the number of minutes:");
		
		int min=sc.nextInt();
		
		Cellular p=s2.getPlan(networkName);
		
		System.out.println("Bill amount for"+networkName+"of "+min);
		
		p.getRate();

		p.processBill(min);
		
	}

}
