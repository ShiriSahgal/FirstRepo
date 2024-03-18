package com.marc16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class MainPage {
	public static void main(String[] args) {
		ArrayList<Menu>al = new ArrayList<Menu>();
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		do {
			System.out.println("*********Welcome To Hotel Management System*********");
			System.out.println("Press1-Insert Menu");
			System.out.println("Press2-Read Menu");
			System.out.println("Press3-Update Menu");
			System.out.println("Press4-Delete Menu");
			System.out.println("Press5-Calculate Total Bill");
			System.out.println("Press6-Exit");
			System.out.println("Enter Choice:");
			ch =sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Menu Id:");
				int menuId = sc.nextInt();
				System.out.println("Enter Menu Name:");
				String menuName = sc.next();
				System.out.println("Enter Menu Price:");
				int menuPrise = sc.nextInt();
				System.out.println("Enter Menu Category:");
				String menuCategory = sc.next();
				System.out.println("Enter Menu Quantity:");
				int qty = sc.nextInt();
				
				al.add((new Menu(menuId,menuName,menuPrise,menuCategory,qty)));
				System.out.println("-----------------------------------------------------------");
				System.out.println("Record Added Successfully!!!!!");
				System.out.println("-----------------------------------------------------------");
				break;
			case 2:
				System.out.println("****Read Details****");
				System.out.println("----------------------------------------------------");
				System.out.println("MenuId"+" "+"MenuName"+" "+"MenuPrice"+" "+"MenuCategory"+" "+"MenuQuantity");
				System.out.println("----------------------------------------------------");
				Iterator<Menu>m=al.iterator();
				while(m.hasNext()) {
					Menu m1=m.next();
				System.out.println(m1.getMenuId()+"\t"+m1.getMenuName()+"\t"+m1.getMenuPrise()+"\t"+m1.getMenuCategory()+"  \t"+m1.getQuantity());
				}
				break;
			case 3:
				boolean found = false;
				System.out.println("Enter MenuId which you want to update:");
				menuId = sc.nextInt();
				ListIterator<Menu>li=al.listIterator();
				while(li.hasNext()) {
					Menu mm=li.next();
					if(mm.getMenuId()==menuId) {
						System.out.println("Enter Menu Name:");
						menuName = sc.next();
						System.out.println("Enter Menu Price:");
						menuPrise = sc.nextInt();
						System.out.println("Enter Menu Category:");
						menuCategory = sc.next();
						System.out.println("Enter Menu Quantity:");
						qty = sc.nextInt();
						li.set(new Menu(menuId,menuName,menuPrise,menuCategory,qty));
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
				System.out.println("Enter MenuId which you want to delete:");
				menuId = sc.nextInt();
				ListIterator<Menu>li1=al.listIterator();
				while(li1.hasNext()) {
					Menu mm=li1.next();
					if(mm.getMenuId()==menuId) {
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
				System.out.println("Calculate Bill");
				found=false;
				int TB = 0;
				System.out.println("Enter MenuId To calculate Bill:");
				
				menuId=sc.nextInt();
				ListIterator<Menu>li2=al.listIterator();
				while(li2.hasNext()) {
					Menu mm=li2.next();
						if(mm.getMenuId()==menuId)
						{
							TB= mm.getMenuPrise()*mm.getQuantity();
							found=true;
						}
						}
		    	 if(!found)
				     System.out.println("Record Not Found");
				     else
				    	System.out.println("----------------------------------------------------");
						System.out.println("MenuId"+" "+"MenuName"+" "+"MenuPrice"+" "+"MenuCategory"+" "+"MenuQuantity");
						System.out.println("----------------------------------------------------");
						Iterator<Menu>m12=al.iterator();
						while(m12.hasNext()) {
							Menu m1=m12.next();
						System.out.println(m1.getMenuId()+"\t"+m1.getMenuName()+"\t"+m1.getMenuPrise()+"\t"+m1.getMenuCategory()+"\t"+m1.getQuantity());
						}
						System.out.println("----------------------------------------------------");
				    	 System.out.println("Total Bill="+TB);
				     break;
			case 6:
				System.out.println("Thank You !! Visit Again!! ");
				break;
			default:
				System.out.println("You Entered Wrong Choice !! Please Select appropriate option.....");
				System.out.println("____________________________________________________________________");
				//break;
			}
		}while(ch!=6);
	}
	
}
