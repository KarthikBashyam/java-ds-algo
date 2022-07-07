package com.practice.arrays;

/**
 * Sliding Window Technique
 * 
 * @author karthikbashyam
 *
 */
public class MaximumSubArrayOfSizeK {
	
	public static void main(String[] args) {
		
		int[] arr = {2, 1, 5, 1, 3, 2};
		
		int k = 3;
		int windowSum = 0;
		int max = 0;
		
		for(int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
			windowSum += arr[windowEnd];
			
			if(windowEnd >= k) {
				windowSum -= arr[windowEnd - k];
			}
			max = Math.max(max, windowSum);				
		}
		
		System.out.println(max);
	}

}
