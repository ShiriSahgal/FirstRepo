package com.april5.Main;

import java.util.Scanner;

import com.april5.dao.LibraryDao;
import com.april5.pojo.Library;

public class LibraryApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.next();
		System.out.println("Welcome to Library Management System:"+name);
		System.out.println("----------------------------------------------------");
		int ch = 0;
		do {
			System.out.println("Press:1 -> Insert Book Detail");
			System.out.println("Press:2 -> Update Existing Book Detail");
			System.out.println("Press:3 -> Delete Book Detail");
			System.out.println("Press:4 -> Read All Book Info");
			System.out.println("Press:5 -> Exit..");
			System.out.println("----------------------------------------------------");
			System.out.println("Enter Choice:");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Book Name:");
				String bookName = sc.next();
				System.out.println("Enter Book Author Name:");
				String authName =  sc.next();
				System.out.println("Enter Publish Date:");
				String publishDate = sc.next();
				System.out.println("Enter Price:");
				String price = sc.next();
				System.out.println("Enter Quantity:");
				String qty = sc.next();
				Library l = new Library(bookName,authName,publishDate,price,qty);
				boolean ans = LibraryDao.insertBook(l);
				System.out.println("Data Inserted Successfully.....");
				System.out.println("----------------------------------------------------");
				break;
			case 2:
				System.out.println("Press :1 To Update Book Name:");
				System.out.println("Press :2 To Update Author Name:");
				System.out.println("Press :3 To Update Publish Date:");
				System.out.println("Press :4 To Update Price:");
				System.out.println("Press :5 To Update Quantity:");
				int val = sc.nextInt();
				if (val==1) 
				{
				System.out.println("Enter Book Name which you want to update:");
				
				String bknm =sc.next();
				System.out.println("Enter Book Id:");
				int id = sc.nextInt();
				Library l1 =new Library();
				l1.setBookName(bknm);
				boolean f = LibraryDao.updateLibararyBook(val, bknm, id, l1);
				System.out.println("Book Name Updated Successfully....");
				System.out.println("----------------------------------------------------");
				}
				else if(val == 2) {
					System.out.println("Enter Authork Name which you want to update:");
					String anm =sc.next();
					System.out.println("Enter Book Id:");
					int id = sc.nextInt();
					Library l1 =new Library();
					l1.setBookName(anm);
					boolean f = LibraryDao.updateLibararyBook(val, anm, id, l1);
					System.out.println("Author Name Updated Successfully....");
					System.out.println("----------------------------------------------------");
				}
				else if (val==3) {
					System.out.println("Enter Publish Date which you want to update:");
					String dat =sc.next();
					System.out.println("Enter Book Id:");
					int id = sc.nextInt();
					Library l1 =new Library();
					l1.setBookName(dat);
					boolean f = LibraryDao.updateLibararyBook(val, dat, id, l1);
					System.out.println("Publish Date Updated Successfully....");
					System.out.println("----------------------------------------------------");
				}
				else if (val==4) {
					System.out.println("Enter Book Name which price you want to update:");
					String prz =sc.next();
					System.out.println("Enter Book Id:");
					int id = sc.nextInt();
					Library l1 =new Library();
					l1.setBookName(prz);
					boolean f = LibraryDao.updateLibararyBook(val, prz, id, l1);
					System.out.println("Book Price Updated Successfully....");
				}
				else if (val==5) {
					System.out.println("Enter Book Name which quantity you want to update:");
					String quan=sc.next();
					System.out.println("Enter Book Id:");
					int id = sc.nextInt();
					Library l1 =new Library();
					l1.setBookName(quan);
					boolean f = LibraryDao.updateLibararyBook(val, quan, id, l1);
					System.out.println("Quantity Updated Successfully....");
					System.out.println("----------------------------------------------------");
				}
				else {
					 System.out.println("Data is not updated!!!");
				 }
				break;
			case 3:
				System.out.println("Enter Book Id Which you want to delete:");
				int id = sc.nextInt();
				LibraryDao.deleteBook(id);
				System.out.println("Book Data is Deleted Successfully......");
				System.out.println("----------------------------------------------------");
					break;
			case 4:
				LibraryDao.showAllBook();
				break;
			case 5:
			System.out.println("Thank You to visit our Library | Visit Again....");
			System.out.println("***********************************************");
			break;
			default:
				System.out.println("Wrong Choice!!!");
			
				}
				
		}while(ch!=5);

	}

}
