package com.march12;
class info{
	void printName(int no) {
		synchronized(this) {
		for(int i=1; i<=5;i++) {
			System.out.println(no*i);
		}
	}
}
}
class A extends Thread{
	info i1;
	A(info i1){
		this.i1=i1;
	}
	public void run() {
		i1.printName(100);
	}
}
class B extends Thread{
	info i1;
	B(info i1){
		this.i1=i1;
	}
	public void run() {
		i1.printName(2);
	}
}
public class SynchronizedBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		info obj = new info();
		A a1 = new A(obj);
		B b1 = new B(obj);
		a1.start();
		b1.start();

	}

}
