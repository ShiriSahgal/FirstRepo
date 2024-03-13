package com.march12;

class Table{
	
	synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
	}
	
}

class Table2  extends Thread{
	Table t1;
	Table2(Table t1){
		this.t1=t1;
	}
	public void run() {
		t1.printTable(10);
	}
}

class Table3 extends Thread{
	Table t1;
	Table3(Table t1){
		this.t1=t1;
	}
	public void run() {
		t1.printTable(5);
	}
}
public class Test6 {

	public static void main(String[] args) {
		
		Table tt=new Table();
		
		Table2 t11=new Table2(tt);
		Table3 t12=new Table3(tt);
		t11.start();
		t12.start();

	}

}