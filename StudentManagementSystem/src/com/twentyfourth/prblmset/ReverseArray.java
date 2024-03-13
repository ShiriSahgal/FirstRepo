package com.twentyfourth.prblmset;

public class ReverseArray {

	public static void main(String[] args) {
		// imp program 
		int arr[]=new int[] {10,20,20,80,70};
		System.out.println("Original Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nReverse Array");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
