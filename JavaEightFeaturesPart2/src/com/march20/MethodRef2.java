package com.march20;

import java.util.function.BiFunction;

class ArithmaticOp{
	static int add(int i, int j) {
		return i+j;
	}
}
class ArithmaticSub{
	static int sub(int a, int b) {
		return a-b;
	}
}
public class MethodRef2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Integer>b1=ArithmaticOp::add;
		int x=b1.apply(12,10);
		System.out.println(x);
		
		BiFunction<Integer,Integer,Integer>b2=ArithmaticSub::sub;
		int y=b2.apply(12,10);
		System.out.println(y);
	}

}
