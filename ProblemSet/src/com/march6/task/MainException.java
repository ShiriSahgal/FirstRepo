package com.march6.task;

import java.util.Scanner;

public class MainException {
	void pn() throws NegativeException, PositiveException {
		Scanner sc = new Scanner(System.in);
System.out.println("Enter number:");
		
		int no=sc.nextInt();
		
		if(no>0) {
			throw new PositiveException("no is greter than zero");
		}
		else if(no<0) {
			throw new NegativeException("no is less than zero");
		}
		else {
			System.out.println("no is zero");
		}
		
	}


	public static void main(String[] args) {
		MainException m1=new MainException();
		
		try {
			m1.pn();
		} catch (PositiveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
