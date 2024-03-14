package com.march14;

import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeMenuDrivenApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch=0;
		LinkedList<Employee>e1=new LinkedList<Employee>();
		do {
			System.out.println("Employee Management System!!!");
			System.out.println("Press 1 Enter Employee Detail:");
			System.out.println("Press 2 Display Employee Detail:");
			System.out.println("Press 3 Update Employee Detail:");
			System.out.println("Press 4 Delete Employee Detail:");
			System.out.println("Press 5 Exit!!");
			System.out.println("Enter Choice:");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Employee Id:");
				int id= sc.nextInt();
				System.out.println("Enter Employee Name:");
				String name = sc.next();
				System.out.println("Enter Employee Age:");
				int age = sc.nextInt();
				System.out.println("Enter Employee Salary:");
				double salary = sc.nextDouble();
				System.out.println("Enetr Employee Designation:");
				String designation = sc.next();
				e1.add((new Employee (id,name,age,salary,designation)));
				System.out.println("Data Added Successfully!!!");
				break;
			case 2:
				System.out.println("Details:");
				for(int i=0;i<e1.size();i++) {
					System.out.println(e1.get(i));
				}
				break;
			case 3 :
				System.out.println("Enter Index number Which Employee Detail You want to edit:");
				int i = sc.nextInt();
				System.out.println("Enter Name Which you want update");
				String name1 = sc.next();
				Employee e = new Employee();
				e.setName(name1);
				e1.set(i, e);
				System.out.println("Employee Name Updated!!!");
			break;
			case 4:
				System.out.println("Enter Index which employee detail you want to delete:");
				int in = sc.nextInt();
				e1.remove(in);
				System.out.println("Detail Removed Sucessfully!!");
				break;
			case 5:
				System.out.println("Exit!!");
				break;
			default:
				System.out.println("Wrong Choice!!");
			}
		}while(ch!=5);
		System.out.println("Thank You!! Visit Again!!!!");
	}

}
