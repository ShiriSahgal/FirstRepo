package com.eb.Mackito23;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class JunitMockitoDemo {
	private Calculator cal;
	@BeforeEach
	public void setDemo()
	{
		//CREATE OBJECT OF GIVEN CLASS
		cal=mock(Calculator.class);
		when(cal.addition(1, 1)).thenReturn(2);
		when(cal.subtraction(1, 1)).thenReturn(0);
	}
	@Test
	public void testAddition()
	{
		//asserteQUALS(EXPECTED ANSER,ACTUAL ANSWER)
		Assertions.assertEquals(2,cal.addition(1, 1));
		verify(cal).addition(1, 1);
	}
	@Test
	public	void testSubtraction()
	{
		Assertions.assertEquals(0,cal.subtraction(1, 1));
		verify(cal).subtraction(1, 1);
	}

}

