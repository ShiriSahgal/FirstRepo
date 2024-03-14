package com.march13;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendMenuDrivenApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		ArrayList<Friends>a1 = new ArrayList<Friends>();
		do {
			System.out.println("Press 1: Enter Friend Details ");
			System.out.println("Press 2: Display Friend Details ");
			System.out.println("Press 3: Remove Friend Details ");
			System.out.println("Press 4: Exit ");
			System.out.println("Enter Choice");
			ch =sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Friend Name:");
				String name = sc.next();
				System.out.println("Enter Friend Age:");
				String age = sc.next();
				a1.add(new Friends(age,name));
				System.out.println(a1);
				break;
			case 2:
				System.out.println("Details");
				for(int i=0;i<a1.size();i++) {
					System.out.println(a1.get(i));
				}
				break;
			case 3:
				System.out.println("Remove Friend Detail");
				System.out.println("Enter Which Friend Detail You want to delete:");
				String rmName = sc.next();
                boolean found = false;
                for (int i = 0; i < a1.size(); i++) {
                    if (a1.get(i).getName().equals(rmName)) {
                        a1.remove(i);
                        found = true;
                        System.out.println("Friend Detail Removed");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Friend Detail not found");
                }
                break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Wrong Input");
			
			}
		}while(ch!=4);
	}

}
