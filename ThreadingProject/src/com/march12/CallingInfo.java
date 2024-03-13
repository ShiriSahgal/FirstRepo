package com.march12;

public class CallingInfo extends Thread {
public  void run() {
	for(int i=1;i<=5;i++) {
		
		System.out.println(i);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallingInfo c1=new CallingInfo();
		CallingInfo c2=new CallingInfo();
		CallingInfo c3=new CallingInfo();
		System.out.println("calling c1");
		c1.start();
		try {
			c1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("calling c2");
		c2.start();
		try {
			c2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("calling c3");
		c3.start();
		try {
			c3.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(c1.getName()+" "+c2.getName()+" "+c3.getName());
		
		

	}

}
