package com.march6.task;
class GrandFather{
	void show() {
		System.out.println("This is Grand Father Class");
	}
}
class Father extends GrandFather{
	void show() {
		super.show();
		System.out.println("This is Father Class");
	}
}
class Mother extends Father{
	void show() {
		super.show();
		System.out.println("This is Mother Class");
	}
}
class Child extends Mother {
	void show() {
		super.show();
		System.out.println("This is Child Class");
	}
}
public class HybridUsingSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.show();

	}

}
