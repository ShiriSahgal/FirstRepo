package com.march18;
interface calci
{
	public void calsq(int x);
}
class A implements calci{

	@Override
	public void calsq(int x) {
		// TODO Auto-generated method stub
		System.out.println(x*x);
	}
	
}
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A a1=new A();
			a1.calsq(10);
	}

}
