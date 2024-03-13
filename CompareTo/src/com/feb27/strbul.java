package com.feb27;

public class strbul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder  s = new StringBuilder();
		s.append("java");
		s.append("AWS");
		s.append("c#");
		s.append("javascript");
		System.out.println(s);
		s.insert(1,"Css");
		System.out.println(s);
		//s.replace(Startindex,endindex,'string');
		s.replace(7,9,"Jhon");
		System.out.println(s);
		String s1 = new String();
		s.delete(10,15);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		

	}

}
