/**
 * 
 */
package com.dsa.arrays;

import java.util.Scanner;

/**
 * @author Abhinav Jha
 *
 */
public class RainWaterTrappingProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		System.out.println(rainwater(arr));
	}

	// The famous Rain water trapping problem
	public static int rainwater(int arr[]) {
		int n = arr.length;
		int left[] = new int[n];
		int right[] = new int[n];
		left[0] = arr[0];
		right[n - 1] = arr[n - 1];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}
		for (int j = n - 2; j >= 0; j--) {
			right[j] = Math.max(right[j + 1], arr[j]);
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += (Math.min(left[i], right[i]) - arr[i]);
		}
		return ans;

	}
}
