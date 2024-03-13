package com.march6.task;

public class excptyctch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int i=1,j=0;
			System.out.println(i/j);
		}
		catch(Exception e) {
			e.printStackTrace();
			//will print java.lang.ArithmeticException: / by zero
			//at com.march6.task.excptyctch.main(excptyctch.java:10)

			System.out.println(e.getMessage());
			//will print / by zero

			}

	}

}
