package com.feb26;

public class MinMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,3,9,5,2,7};
		int max = array[0];
		int min = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
			max  =array[i];
		}
		if (array[i]<min) {
			min = array[i];
			
		}

	}
	System.out.println("Maximum Value:"+max);
	System.out.println("Minimum  Value:"+min);

}
}