package com.dsa.arrays;

import java.util.Arrays;

public class Maximum {

	public static void main(String[] args) {

		int arr[] = { 60, 35, 15, 10, 85, 40, 25 };
		System.out.println(Arrays.toString(arr));

		// printing the maximum value from array........

		System.out.println("Maximum value present inside the array is: "+maximum(arr));
	}

	// defining the function to find the maximum elements in the array
	public static int maximum(int arr[]) {

		// initializing the array with the lowest possible value of int
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			// condition check
			if (max < arr[i]) {

				// assigning the max value
				max = arr[i];
			}
		}
		return max;

	}

}
