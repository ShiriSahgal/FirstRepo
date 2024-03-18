package com.march18;
interface Shape{
	
	public void show() ;
}
class Cube implements Shape{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This is cube shape class");
	}
	
}
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube c1=new Cube();
		
		c1.show();
	}

}
