package com.march20;

import java.util.function.BiFunction;

public class Mr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,String,Student>b=Student::new;
		b.apply(101,"Roshani Sahu");
		System.out.println(b.apply(101,"Roshani Sahu"));
		System.out.println(b.apply(102,"Abhay Sahgal"));
		System.out.println(b.apply(103,"Shiri Sahgal"));
	}

}
