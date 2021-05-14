package com.dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InverseArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int[] res = new int[arr.length];
		inverse(arr, res);

		// System.out.println(Arrays.toString(arr));

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

		System.out.println();
		// System.out.println(Arrays.toString(res));
	}

	// implementing the logic of inversing the index value with array elements:

	public static int[] inverse(int[] arr, int[] res) {
		for (int i = 0; i < arr.length; i++) {
			res[arr[i]] = i;
		}

		return res;
	}
}
