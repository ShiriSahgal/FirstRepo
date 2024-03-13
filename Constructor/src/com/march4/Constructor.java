package com.march4;
class Employee{
	int id;
	String name;
	public Employee() {
		System.out.println("This is default constructor");
	}
	public Employee(int i,String n) {
		id=i;
		name=n;
		System.out.println(id+" "+name);
	}
}
public class Constructor {
	public static void main(String [] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(101,"Rohan");
		Employee e3 = new Employee(102,"Anklesh");
		Employee e4 = new Employee(103,"Pratiksha");
		Employee e5 = new Employee(104,"Deepika");
		Employee e6 = new Employee(105,"Sahu");
		
	}

}
