package com.march4;
abstract class Bank{
	abstract void getRoi(double r);
	
	void show() {
		System.out.println("This is show method for Bank");
	}
}
class BankA extends Bank{

	@Override
	void getRoi(double r) {
		System.out.println("Rate of BankA:"+r);
		
	}
	
}
public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA b1=new BankA();
	      b1.getRoi(10.50);

		  b1.show();

	}

}
