package com.factory;

 abstract class Cellular {
	double rate;
	abstract void getRate();
	public void processBill(int min) {
		System.out.println(min*rate);
	}
}
