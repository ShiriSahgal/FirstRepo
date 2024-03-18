package com.marc16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student>sal = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		int ch = 0;
		do {
			System.out.println("*********Welcome To Student Management System*********");
			System.out.println("Press1-Insert Student Detail");
			System.out.println("Press2-Display Student Detail");
			System.out.println("Press3-Update Student Detail");
			System.out.println("Press4-Delete Student Detail");
			System.out.println("Press5-Display Total Student");
			System.out.println("Press6-Exit");
			System.out.println("Enter Choice:");
			ch =sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Student Id:");
				int Sid = sc.nextInt();
				System.out.println("Enter Student Name:");
				String Sname = sc.next();
				System.out.println("Enter Division:");
				String Sdiv = sc.next();
				System.out.println("Enter Standard:");
				int Sstd = sc.nextInt();
				System.out.println("Enter Student Age:");
				int Sage = sc.nextInt();
				System.out.println("Enter Student Marks:");
				int Smarks = sc.nextInt();
				sal.add(new Student(Sid,Sname,Sdiv,Sstd,Sage,Smarks));
				System.out.println("-----------------------------------------------------------");
				System.out.println("Record Added Successfully!!!!!");
				System.out.println("-----------------------------------------------------------");
				break;
			case 2:
				System.out.println("*********Student Details*********");
				System.out.println("----------------------------------------------------");
				System.out.println("SId"+" "+"StudentName"+" "+"SDiv"+" "+"SStd"+" "+"Studentage"+" "+"Smarks");
				System.out.println("----------------------------------------------------");
				Iterator<Student>m=sal.iterator();
				while(m.hasNext()) {
					Student s1=m.next();
				System.out.println(s1.getSid()+"\t"+s1.getSname()+"\t"+s1.getSdiv()+"\t"+s1.getSstd()+"\t"+s1.getSage()+"\t"+s1.getSmarks());
				}
				break;
			case 3:
				boolean found = false;
				System.out.println("Enter StudentId which you want to update:");
				Sid = sc.nextInt();
				ListIterator<Student>li=sal.listIterator();
				while(li.hasNext()) {
					Student mm=li.next();
					if(mm.getSid()==Sid) {
						System.out.println("Enter Student Name:");
						Sname = sc.next();
						System.out.println("Enter Division:");
						Sdiv = sc.next();
						System.out.println("Enter Standard:");
						Sstd = sc.nextInt();
						System.out.println("Enter Student Age:");
						Sage = sc.nextInt();
						System.out.println("Enter Student Marks:");
						Smarks = sc.nextInt();
						li.set(new Student(Sid,Sname,Sdiv,Sstd,Sage,Smarks));
						found =true;
						
					}
				}
				if(!found)
					System.out.println("Record Not Found");
				else
					System.out.println("Record Updated Successfully!!!");
			break;
			case 4:
				found = false;
				System.out.println("Enter StudentId which you want to delete:");
				Sid = sc.nextInt();
				ListIterator<Student>li1=sal.listIterator();
				while(li1.hasNext()) {
					Student mm=li1.next();
					if(mm.getSid()==Sid) {
						li1.remove();
						
						found =true;
						
					}
				}
				if(!found)
					System.out.println("Record Not Found");
				else
					System.out.println("Record Deleted Successfully!!!");
				break;
			case 5:
				 System.out.println("Enter Division to count students:");
				    String division = sc.next();
				    int count = 0;
				    for(Student student : sal) {
				        if(student.getSdiv().equalsIgnoreCase(division)) {
				            count++;
				        }
				    }
				    System.out.println("Total number of students in division " + division + ": " + count);
				    break;
				
			case 6:
				System.out.println("Exit!!!!!");
			default:
				System.out.println("You have Entered Wrong Choice Please Select Appropriate Choice.......");
				System.out.println("____________________________________________________________________");
				
			}
			
		}while(ch!=6);

	}

}
