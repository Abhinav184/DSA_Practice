package com.dsa.arrays;

import java.util.Arrays;

public class LinearSearchInArray {
	
	// Applying the logic..........

	public static int linearSearch(int[] arr, int ele){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == ele){    
            	System.out.print("Element found at index: ");
                return i;
            }    
        }    
        return -1;    
    }    

	public static void main(String[] args) {

		int arr[] = { 60, 35, 15, 10, 85, 40, 25 };
		int ele = 85;
		System.out.println(Arrays.toString(arr));
		System.out.println("Element to be find in array: "+ele);
		System.out.println(linearSearch(arr, ele));
	}
	
}
