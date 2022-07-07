package com.practice.arrays;

/**
 * Kadane's algorithm
 * 
 * @author karthikbashyam
 *
 */
public class MaximumSubArraySum {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 7, -2, -5, 10, -1};
		
		int globalMax = arr[0];
		int currMax = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(currMax < 0) {
				currMax = arr[i];
			} else {
				currMax += arr[i];
			}
			
			globalMax = Math.max(globalMax, currMax);
		}
		
		System.out.println(globalMax);
	}
	

}
