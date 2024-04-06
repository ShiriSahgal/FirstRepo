package com.feb26;

import java.util.Arrays;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		 int[] arr = {66,2,2,2 ,78,23,23,44,44}; // Example array with duplicates
	        int n = arr.length;

	        // Sort the array to bring duplicates together
	        Arrays.sort(arr);

	        // Initialize variables for new array and index
	        int[] temp = new int[n];
	        int j = 0;

	        // Traverse the sorted array and copy unique elements to the new array
	        for (int i = 0; i < n - 1; i++) {
	            if (arr[i] != arr[i + 1]) {
	                temp[j++] = arr[i];
	            }
	        }

	        // Copy the last element (which is always unique)
	        temp[j++] = arr[n - 1];

	        // Copy the unique elements from temp array to original array
	        for (int i = 0; i < j; i++) {
	            arr[i] = temp[i];
	        }

	        // Print the array after removing duplicates
	        System.out.println("Array with duplicates removed:");
	        for (int i = 0; i < j; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}