package com.factory;
class BOI implements Plan{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		System.out.println("The Rate of BOI:"+rate+"%");
	}
	
}
class SBI implements Plan{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		System.out.println("The Rate of SBI:"+rate+"%");
	}
	
}
class BOB implements Plan{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		System.out.println("The Rate of BOB:"+rate+"%");
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOI b1 = new BOI();
		b1.getRoi(8.2);
		
		SBI s1 = new SBI();
		s1.getRoi(7.2);
		
		BOB b2 = new BOB();
		b2.getRoi(6.2);
	}

}
