package com.practice.sorting;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		mergeSort(arr);

		for (int e : arr) {
			System.out.println(e);
		}

	}

	private static void mergeSort(int[] arr) {

		if (arr.length == 1) {
			return;
		}

		int mid = (int) Math.floor(arr.length / 2);

		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}

		for (int j = mid; j < arr.length; j++) {
			right[j - mid] = arr[j];
		}

		mergeSort(left);
		mergeSort(right);
		merge(arr, left, right);
	}

	private static void merge(int[] arr, int[] left, int[] right) {

		int m = left.length;
		int n = right.length;

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < m && j < n) {

			if (left[i] < right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}

		}

		while (i < m) {
			arr[k++] = left[i++];
		}

		while (j < n) {
			arr[k++] = right[j++];
		}

	}

}
