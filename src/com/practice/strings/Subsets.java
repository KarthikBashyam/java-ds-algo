package com.practice.strings;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {

		String str = "abc";

		List<List<String>> subsets = new ArrayList<>();
		subsets.add(new ArrayList<>());

		for (Character c : str.toCharArray()) {
			int n = subsets.size();

			for (int i = 0; i < n; i++) {
				List<String> newSubList = new ArrayList<>(subsets.get(i));
				newSubList.add(String.valueOf(c));
				subsets.add(newSubList);
			}

		}
		
		System.out.println(subsets);

	}
}
