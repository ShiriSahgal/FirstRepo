package com.march21;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;

import org.junit.Ignore;
import org.junit.Test;


public class TestJUnitDemo2 {
	@Test
	public void disp() {
		System.out.println("This is disp method");
	}

	@Test
	public void accept() {
		assertTrue(12>4);
		System.out.println("Condition for accept method");
	}
	@After
	public void accept1() {
		assertFalse(12<4);
		System.out.println("Condition for accept1 method");
	}
	@Test
	public void accept2() {
		String a = "Edubridge";
		assertNotNull(a);
		System.out.println(a);
	}

	@Ignore
	public void accept3() {
		String b = null;
		assertNull(b);
		System.out.println("Accept 3 Run");
	}
@AfterClass
public static void aceept4() {
	System.out.println("After all run ");
}
}
