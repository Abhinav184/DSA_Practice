package com.dsa.arrays;

import java.util.Scanner;

public class BarGraph {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		graph(arr, n);
	}

	public static int maximum(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void graph(int arr[], int n) {
		int max = maximum(arr);
		for (int row = 0; row < max; row++) {
			for (int i = 0; i < arr.length; i++) {
				if (max - row <= arr[i]) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
