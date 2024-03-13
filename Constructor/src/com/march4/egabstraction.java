package com.march4;
abstract class Students{
	abstract void attendance(int pd);
	
	void showName(String bc) {
		System.out.println(" Batch code: "+bc);
	}
}

abstract class LBY{
	abstract void showModule(String modulename);
}
class Elites extends Students{

	@Override
	void attendance(int pd) {
		
		System.out.println("Total days: "+pd);
	}
}
class Elites1 extends LBY{

	@Override
	void showModule(String modulename) {
		System.out.println("Module running: "+modulename);
		
	}
	
}
public class egabstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elites e1=new Elites();
		
		e1.attendance(30);
		e1.showName("2023-11221");
		
		Elites1 e2=new Elites1();
		
		e2.showModule("Devops");

	}

}
