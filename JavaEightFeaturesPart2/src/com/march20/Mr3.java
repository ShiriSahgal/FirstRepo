package com.march20;

import java.util.function.BiFunction;

class op{
	public int add(int a1,int b1) {
		return a1+ b1;
	}
	public int sub(int a1,int b1) {
		return a1-b1;
	}
	public int mul(int a1,int b1) {
		return a1* b1;
	}
	public int div(int a1,int b1) {
		return a1/ b1;
	}
}
public class Mr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Integer>bb1=new op()::add;
		int result1=bb1.apply(10, 20);
		System.out.println("Addition:"+result1);
		BiFunction<Integer,Integer,Integer>bb2=new op()::sub;
		int result2=bb2.apply(10, 20);
		System.out.println("Substraction:"+result2);
		BiFunction<Integer,Integer,Integer>bb3=new op()::mul;
		int result3=bb3.apply(10, 20);
		System.out.println("Multiplication:"+result3);
		BiFunction<Integer,Integer,Integer>bb4=new op()::div;
		int result4=bb4.apply(10, 20);
		System.out.println("Division:"+result4);
	
		
	}

}
