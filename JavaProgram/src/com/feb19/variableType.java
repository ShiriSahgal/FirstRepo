package com.feb19;

public class variableType {
	int empid = 101;
	static int totalEmp = 1000;
	static String Companyname ="Cateina Technology Pvt. Ltd.";
	
	void companyPov() {
		String cmprule ="Seek,Find,Learn";
		System.out.println("Company rule:"+cmprule);
	}
	void empnames() {
		String empname ="Tarun Patel";
		System.out.println("Employee name:" +empname);
		}
	
   void show() {
	   System.out.println("Emoloyee id:"+empid);
   }
	public static void main(String[] args) {
		variableType vt = new variableType();
		vt.show();
		vt.empnames();
		vt.companyPov();
		
		System.out.println("Total Employee:"+variableType.totalEmp);
		
		

	}

}
