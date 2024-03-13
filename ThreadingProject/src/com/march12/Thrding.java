package com.march12;

public class Thrding extends Thread {

	public void run() {
		System.out.println("this is run method");//run the code and display output
	}
	
	public void disp() {
		System.out.println("Disp method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thrding t1=new Thrding();
		
		t1.run();
		t1.disp();		
		//t1.start();   //execution of thread to call run method
		
	}

}
