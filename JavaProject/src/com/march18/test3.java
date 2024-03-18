package com.march18;
@FunctionalInterface
interface Arithmetic{
	public void show (int a,int b);
}
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic a1 = (int i,int j) ->System.out.println("Addition:"+(i+j));
		Arithmetic a2 = (int i,int j) ->System.out.println("Subtraction:"+(i-j));
		Arithmetic a3 = (int i,int j) ->System.out.println("Multiplication:"+(i*j));
		Arithmetic a4 = (int i,int j) ->System.out.println("Division:"+(i/j));
		
		a1.show(10, 20);
		a2.show(10, 20);
		a3.show(10, 20);
		a4.show(10, 20);
	}

}
