package com.april4.Main;

import java.util.Scanner;

import com.april4.dao.StudentDao;
import com.april4.pojo.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Your  Name:");
		String name =  sc.next();
		System.out.println("Welcome to Student Management System:"+name);
		int ch = 0;
		do {
			System.out.println("Press 1: Insert Student Detail");
			System.out.println("Press 2: Update Existing Student Detail");
			System.out.println("Press 3: Delete Student Data");
			System.out.println("Press 4: Read Student Data by Student Id");
			System.out.println("Press 5: Exit!!!");
			System.out.println("Enter Choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Student Name:");
				String sname = sc.next();
				System.out.println("Enter Student Contact Number:");
				String sphone = sc.next();
				System.out.println("Enter Student City:");
				String scity = sc.next();
				
				Student s = new Student(sname,sphone,scity);
				boolean ans = StudentDao.createStudent(s);
				System.out.println("Data Inserted Successfully!!");
			break;
			case 2:
				System.out.println("Press 1: To Update Student Name:");
				System.out.println("Press 2: To Update Student Contact Number:");
				System.out.println("Press 3: To Update Student City:");
				int val = sc.nextInt();
				 if (val == 1) {
					 System.out.println("Enter Student Name which you want to update:");
					 String studname = sc.next();
					 System.out.println("Enter Student Id:");
					 int id = sc.nextInt();
					 Student s1 = new Student();
					 s1.setStudentName(studname);
					 boolean f = StudentDao.updateStudentData(val, studname, id, s1);
					 System.out.println("Student Name is updated successfully!!");
				 }
					 else if(val==2) {
						 System.out.println("Enter Student Contact which you want to update:");
						 String stucon = sc.next();
						 System.out.println("Enter Id:");
						 int id =  sc.nextInt();
						 Student s1 = new Student();
						 s1.setStudentPhone(stucon);
						 boolean f = StudentDao.updateStudentData(val, stucon, id, s1);
						 System.out.println("Student Contact Detail Updated successfully!!");
					 }
					 else if (val==3) {
						 System.out.println("Enter Student City which you want to update:");
						 String stucty = sc.next();
						 System.out.println("Enter Id:");
						 int id =  sc.nextInt();
						 Student s1 = new Student();
						 s1.setStudentCity(stucty);
						 boolean f = StudentDao.updateStudentData(val, stucty, id, s1);
						 System.out.println("Student City  Updated successfully!!");
					 }
					 else {
						 System.out.println("Data is not updated!!!");
					 }
					 break;
					 case 3:
						 System.out.println("Enter Student Id which you want to delete:");
						 int id = sc.nextInt();
						 StudentDao.deleteMenu(id);
						 System.out.println("Student Data deleted successfully!!!!");
						 break;
					 case 4:
						 StudentDao.showAllData();
						 break;
					 case 5:
						 System.out.println("Thank You To use our application .. | Visit Again....");
						 break;
						 
						 default :
							 System.out.println("Wrong Choice!!");
				 }
			}while(ch!=5);
		}
	}


