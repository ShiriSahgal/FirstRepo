package com.march6.task;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s = "Welcome";
			System.out.println(s.lastIndexOf('e'));
			int a[]=new int[5];
			System.out.println(a[0 ]);
			int a1=10,b=2;
			System.out.println(a1/b);
			}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			}
		finally {
			String email = "eroshanisahu@gmail.com";
			System.out.println(email);
		}
		}

}
