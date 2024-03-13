package com.march4;
interface i1{
	void disp() ;
}
interface i2{
	void disp1() ;
}
//here on line 10 we acheiving multiple inheritance
//in interface we can extend more than one interface at time
interface i3 extends i1,i2{
	void disp3() ;
}
class i4 implements i3{

	@Override
	public void disp() {
		System.out.println("This is disp method");
		
	}

	@Override
	public void disp1() {
		System.out.println("This is disp1 method");
	}

	@Override
	public void disp3() {
		System.out.println("This is disp2 method");
		
	}
}

public class interfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
i4 i=new i4();
		
		i.disp();
		i.disp1();
		i.disp3();


	}

}
