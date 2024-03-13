package com.march6.task;

public class Stringexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
