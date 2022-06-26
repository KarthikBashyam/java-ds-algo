package com.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeArrayWithOverlappingintervals {

	public static void main(String[] args) {

		int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

		List<Pair> list = new ArrayList<>();
		list.add(buildPair(arr[0]));

		for (int i = 1; i < arr.length; i++) {
			
			Pair existingPair = list.get(list.size() - 1);
			
			Pair nextPair = buildPair(arr[i]);
			
			if(existingPair.second >= nextPair.first) {
				existingPair.second = nextPair.second;
			} else {
				list.add(nextPair);
			}

		}
		
		System.out.println(list);

	}

	private static Pair buildPair(int[] arr) {
		return new Pair(arr[0], arr[1]);
	}

}

class Pair {

	int first;
	int second;

	public Pair(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}
	
	

}
