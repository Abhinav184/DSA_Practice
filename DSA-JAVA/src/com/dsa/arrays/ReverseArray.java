package com.dsa.arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// size of the array
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();

		// declaring an array of the size n
		int arr[] = new int[n];

		// taking the array input from the user
		System.out.println("Please enter " + n + " array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int start = 0;
		int end = arr.length - 1;
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
		for (int k = 0; k < n; k++)
			System.out.print(arr[k] + " ");
	}
}
