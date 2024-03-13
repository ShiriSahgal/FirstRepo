package com.march6.task;

public class ThreadingExample extends Thread{
	public void run() {
		System.out.println("This is thread class run method");
	}
	public void disp() {
		System.out.println("this is disp method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadingExample te = new ThreadingExample();
		
		//te.run();
		te.start();
		te.disp();

	}

}
