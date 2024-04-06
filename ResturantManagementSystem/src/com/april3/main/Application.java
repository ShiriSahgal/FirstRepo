package com.april3.main;

import java.util.Scanner;

import com.april3.dao.MenuDao;
import com.miniproject2april.menu;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.next();
		System.out.println("Welcome to Krishana Restaurant :"+name);
		int ch = 0;
		do {
			System.out.println("Press 1: Add Menu");
			System.out.println("Press 2: Updaate Menu");
			System.out.println("Press 3: Delete Menu");
			System.out.println("Press 4: Read Menu");
			System.out.println("Press 5: Exit");
			System.out.println("Enter Choice:");
			ch = sc.nextInt();
			switch(ch) {
			
			case 1:
				System.out.println("Enter Menu Name:");
				String menuname = sc.next();
				System.out.println("Enter Menu Type:");
				String menutype = sc.next();
				System.out.println("Enter Menu price:");
				int prise = sc.nextInt();
				System.out.println("Enter Menu Quantity:");
				int quantity = sc.nextInt();
				
				menu m = new menu(menuname,menutype,prise,quantity);
				boolean ans = MenuDao.createMenu(m);
				System.out.println("Menu Inserted successfully");
				break;
			case 2:
				System.out.println("press 1 to update menu name:");
				System.out.println("press 2 to update menu type:");
				int val=sc.nextInt();
				
				if(val==1) {
					System.out.println("Enter menu name which u want to update:");
					String menuname1=sc.next();
					System.out.println("Enter Id:");
					
					int id=sc.nextInt();
					menu m1=new menu();
					m1.setMenuName(menuname1);
					boolean f=MenuDao.updateMenuData(val, menuname1, id, m1);
					System.out.println("Menu Name is updated successfully");
			}
				else if(val==2) {
					System.out.println("Enter Menu type which u want to update:");
					String menutype1=sc.next();
					System.out.println("Enter Id:");
					
					int id=sc.nextInt();
					menu m1=new menu();
					m1.setMenuType(menutype1);
					boolean f=MenuDao.updateMenuData(val, menutype1, id, m1);					
					System.out.println("menu type is updated successfully");
				}
				
				else {
					System.out.println("Data is not updated");
				}
			
				break;
			case 3:
				System.out.println("Enter Id which u want delete:");
				int id=sc.nextInt();
				MenuDao.deleteMenu(id);
				System.out.println("Id is deleted");
				break;
			case 4:
			MenuDao.showAllMenus();
				break;
			
			case 5:
				System.out.println("Bye Bye:");
				break;
				default:
					System.out.println("Wrong choice");
			}
		
		}while(ch!=5);
		}

}