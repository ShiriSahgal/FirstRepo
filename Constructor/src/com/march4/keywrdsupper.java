package com.march4;
class Animal{
	void eat() {
		System.out.println("Eat is function of animal class");
	}
}
class Dog extends Animal{
	void eat() {
		super.eat();
		System.out.println("eat is function of dog class");
	}
}
class Cat extends Animal{
	void eat()
	{
		System.out.println("eat is function of cat class");
	}
}
public class keywrdsupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1,a2;
		a1=new Dog();
		a2=new Cat();
		
		a1.eat();
		a2.eat();

	}

}
