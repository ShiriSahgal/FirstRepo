package com.coderChamp5march;
class Roshni{
	void speed(int s) {
		System.out.println("Speed of vehicle:"+s);
	}
}
class sahu extends Roshni{
	void speed(int s) {
		super.speed(120);
		System.out.println("Speed of car:"+s);
	}
}
class kavita extends  Roshni{
	void speed(int s) {
		System.out.println("Speed of bus:"+s);
	}
}
class papa extends kavita{
	void speed(int s) {
		System.out.println("Speed of ByCycle:"+s);
	}
}
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Roshni v1,v2,v3;
		v1 = new sahu();
		v2 = new kavita();
		v3 = new papa();
		
		v1.speed(80);
		v2.speed(100);
		v3.speed(20);
		

	}

}
