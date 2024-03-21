package com.march21;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDemousingJunit {
	@Test
	public void show() {
		String name = "Roshani";
		assertEquals("Roshani",name);
	System.out.println(name);	
	}
		
		@Before
		/*@Before method execute before test method*/
		public void add() {
			int i=10,j=20;
			System.out.println("Addition:"+(i+j));
		}
		@After
		/*@After method will execute after test method*/
		public void sub() {
			int i=10,j=20;
			System.out.println("Substraction:"+(i-j));
		}
		}
