package com.practice.arrays;

public class Test {

	public static void main(String[] args) {

		String str = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(str.length());

		for (int i = 0; i < str.length(); i += 3) {
			System.out.println(str.substring(i, Math.min(str.length(), i + 3)));
		}
	}

}
