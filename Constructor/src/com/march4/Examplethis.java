package com.march4;
class A{
	void show() {
	System.out.println("This is show method");	
	}
	
	void disp() {
		this.show();
		System.out.println("This is disp method");	
	}	
	}

public class Examplethis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a1=new A();
		
		//a1.show();
		a1.disp();

	}

}
