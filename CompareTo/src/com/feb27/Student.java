package com.feb27;
class Student1{
	String name;
	int age;
	void disp(String n, int a) {
		name = n;
		age = a;
		System.out.println("Student Name :"+name+"\nStudent Age:"+age);
	}
}

public class Student {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.disp("John",23);
		s1.disp("Abc",54);
		s1.disp("Xyz",34);
		// TODO Auto-generated method stub

	}

}
