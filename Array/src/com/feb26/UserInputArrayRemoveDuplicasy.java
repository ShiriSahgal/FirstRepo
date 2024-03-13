package com.feb26;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArrayRemoveDuplicasy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the array
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        // Create an array of the specified length
        int[] arr = new int[length];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array to bring duplicates together
        Arrays.sort(arr);

        // Initialize variables for new array and index
        int[] temp = new int[length];
        int j = 0;

        // Traverse the sorted array and copy unique elements to the new array
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Copy the last element (which is always unique)
        temp[j++] = arr[length - 1];

        // Copy the unique elements from temp array to original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        // Print the array after removing duplicates
        System.out.println("Array with duplicates removed:");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}