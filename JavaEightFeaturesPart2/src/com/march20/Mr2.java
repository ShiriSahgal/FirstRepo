package com.march20;
interface add{
	void a();
}
class add2{
	public void b() {
		System.out.println("This is b method");
	}
}
public class Mr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add2 a1 = new add2();
		//Containobject::methodname
		add aa = a1::b;
		aa.a();
	}

}
