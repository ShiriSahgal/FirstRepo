package com.march12;

public class anotherThread implements Runnable {
    @Override
    public void run() {
        System.out.println("This is runnable interface");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				anotherThread t1=new anotherThread();
		    //    java.lang.Thread.Thread(Runnable target)
		        Thread th=new Thread(t1);
		        th.start();
		        
		    }
		}