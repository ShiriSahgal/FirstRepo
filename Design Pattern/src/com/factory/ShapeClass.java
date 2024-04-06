package com.factory;
class circle implements Shape{

	@Override
	public void getName(String name) {
		// TODO Auto-generated method stub
		System.out.println("The Shape Name:"+name);
	}
	
}
class square implements Shape{

	@Override
	public void getName(String name) {
		// TODO Auto-generated method stub
		System.out.println("The Shape name:"+name);
	}
	
}
class rectangle implements Shape{

	@Override
	public void getName(String name) {
		// TODO Auto-generated method stub
		System.out.println("The Shape name:"+name);
		
		
	}
	
}
public class ShapeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c1 = new circle();
		c1.getName("This is Circle");
		square s1 = new square();
		s1.getName("This is Square");
		rectangle r1 = new rectangle();
		r1.getName("This is rectangle");
		
	}

}
