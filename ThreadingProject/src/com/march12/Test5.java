package com.march12;

public class Test5 extends Thread {

	
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Test5 t1=new Test5();
		Test5 t2=new Test5();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	}

}