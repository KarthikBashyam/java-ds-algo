package com.practice.arrays;

import java.util.Arrays;

public class ProductOfNumbersExceptItself {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 4 };

		int[] result = new int[arr.length];

		int zeroCount = 0;
		int total = 1;

		for (int e : arr) {
			if (e > 0) {
				total *= e;
			} else if (e == 0) {
				zeroCount++;
			}
		}

		if (zeroCount == 2) {
			Arrays.fill(result, 0);
		} else if (zeroCount == 1) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					result[i] = total;
				} else {
					result[i] = 0;
				}
			}
		} else {

			for (int i = 0; i < arr.length; i++) {
				result[i] = total / arr[i];
			}

		}
		
		System.out.println(Arrays.toString(result));

	}

}
