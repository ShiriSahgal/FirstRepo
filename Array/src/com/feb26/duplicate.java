
package com.feb26;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,15,20,15,30,55,50,55,60,60};
		int length = arr.length;
		int j=0;
		for(int i=0;i<length -1;i++) {
			if (arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[length-1];
		for (int k=0;k<j;k++) {
			System.out.println(arr[k]);
		}

	}

}
