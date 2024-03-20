package com.march20;
interface Hello{
	void hi();
}
class HelloInfo{
	static void dispSomething(){
		System.out.println("This is static Method");
	}
}
public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h1=HelloInfo::dispSomething;
		h1.hi();
	}

}
