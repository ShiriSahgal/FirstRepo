package com.march21;

import org.junit.After;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

public class TestJunitDemo3 {
	@Test
	public void disp() {
		System.out.println("This is Disp Method");
	}
	@RepeatedTest(3)
	@After
	public void calci() {
		for(int i =10;i<=20;i++) {
			System.out.println(i);
		}
	}
	

}
