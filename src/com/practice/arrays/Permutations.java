package com.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5 };
		
		List<List<Integer>> results = new ArrayList<>();
		
		var test = List.of(1,3);
		
		for(int i = 0; i < test.size(); i++) {
			
			var newList = new ArrayList<>(test);
			newList.set(i, 5);
			System.out.println(newList);
		}

	}
}