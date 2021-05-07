package com.dsa.arrays;

import java.util.Arrays;

public class NumberOfOccurence {

	public static void main(String[] args) {

		int arr[] = { 60, 35, 15, 10, 85, 40, 25, 35, 49, 35, 21, 96, 48 };
		int ele = 35;
		int count = 0;
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("Element need to be find is: " + ele);
		System.out.println();
		System.out.println("Number of times " + ele + " occured in the array is: " + searchNumberOfOccurence(arr, ele));
		System.out.println();
		System.out.println("index on which " + ele + " occured are: " + Arrays.toString(indexOfOccurence(arr, ele)));
	}

	// Counting the number of times an element occured in an array.................

	public static int searchNumberOfOccurence(int arr[], int ele) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				count++;
			}

		}
		return count;
	}

	// Printing the indexes on which the element occured in the array....
	public static int[] indexOfOccurence(int arr[], int ele) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				count++;
			}

		}
		int ans[] = new int[count];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == ele) {
				ans[j] = i;
				j++;
			}
		}
		return ans;
	}

}
