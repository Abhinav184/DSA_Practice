package com.dsa.arrays;

import java.util.Arrays;

public class BinarySearch {
	// prerequisite for binary search is Array should be sorted....
	public static void main(String[] args) {
		int[] arr = { 5, 7, 11, 12, 15, 20, 31, 32, 33 };
		int ele = 12;
		System.out.println(Arrays.toString(arr));

		System.out.println(binarySearch(arr, ele));
	}

	public static int binarySearch(int arr[], int ele) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			//System.out.println(left + " : " + right);
			int mid = (left + right) / 2;
			if (arr[mid] == ele) {
				return mid;
			} else if (arr[mid] < ele) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

}
