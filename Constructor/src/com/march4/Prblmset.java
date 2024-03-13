package com.march4;
class Student{
	String name;
	Student(){
		name = "unkown";
		System.out.println(name);
	}
	Student(String n){
		name = n;
		System.out.println(name);
	}
}
public class Prblmset {
	public static void main(String[] args) {
		Student s1 =new Student();
		Student s2=new Student("Sam Deo");
	}

}
