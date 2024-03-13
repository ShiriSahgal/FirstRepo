package com.march12;
class sync{
	void printtbl(int n) {
		for (int i=1;i<=10;i++) {
			System.out.println(n*i);
			}
		}
}
class Tab1 extends Thread{
	sync s1;
	Tab1(sync s1){
		this.s1=s1;
	}
	public void run() {
		s1.printtbl(10);
	}
}
class Tab2 extends Thread{
	sync s1;
	Tab2(sync s1){
		this.s1=s1;
	}
}

public class NewSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sync sn = new sync();
		Tab1 t1 = new Tab1(sn);
		Tab2 t2 = new Tab2(sn);
		t1.start();
		t2.start();

	}

}
