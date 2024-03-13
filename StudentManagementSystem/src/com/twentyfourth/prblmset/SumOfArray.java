package com.twentyfourth.prblmset;

public class SumOfArray {

	public static void main(String[] args) {
		//imp program for interview
		int arr[]=new int[] {1,2,3,98,76};
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			sum+=arr[i];
			//sum=sum+arr[i];
			}
		System.out.println("The Sum of array elements is :"+sum);
	}

}
