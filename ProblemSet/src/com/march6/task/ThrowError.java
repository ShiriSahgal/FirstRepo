package com.march6.task;
class Throweros{
	public static int dividenumber(int m,int n)throws ArithmeticException{
		int div = m/n;
		return div;
		
	}
}
public class ThrowError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throweros t = new Throweros();
		try {
			System.out.println(Throweros.dividenumber(10, 0));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
