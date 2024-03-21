package com.march21;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestJUnitDemo4 {
	@ParameterizedTest
	@ValueSource(strings = {"Atul","Chetan","Abhay","Roshani"})
	void display(String word) {
		System.out.println(word);
		
	}
	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4})
	void display(int word) {
		System.out.println(word);
		
	}
	
	

}
