package com.march18;
@FunctionalInterface
interface maths{
	public void add(int a,int b);
}
interface maths1{
	public void sub(int a, int b);
}
interface maths2{
	public void mul(int a, int b);
}
interface maths3{
	public void div(int a, int b);
}
public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maths m1=(int i,int j)->System.out.println("Addition is:"+(i+j));
		m1.add(10, 20);
		maths1 m2=(int i,int j)->System.out.println("Substraction is:"+(i-j));
		m2.sub(30, 20);
		maths2 m3=(int i,int j)->System.out.println("Multiplication is:"+(i*j));
		m3.mul(30, 20);
		maths3 m4=(int i,int j)->System.out.println("Division is:"+(i/j));
		m4.div(30, 20);

	}

}
