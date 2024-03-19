package com.march18;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CnsmerBiCnsmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String>c1=x->System.out.println(x);
		
		c1.accept("Hello World");
		

		Consumer<String>c2=x->System.out.println(x);
		
		c2.accept("Jhon");
		
		BiConsumer<String,String>c3=(i,j)->System.out.println("First Name:"+i+"\nLast Name:"+j);
		
		c3.accept("Jhon", "Smith");
	}

}
