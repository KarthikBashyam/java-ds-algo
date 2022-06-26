package com.practice.strings;

public class LongestCommonSubstring {

	public static void main(String[] args) {

		String s1 = "abdca";
		String s2 = "cbdea";

		int[][] dp = new int[s1.length() + 1][s2.length() + 1];

		int maxCount = 0;


		for (int i = 1; i <= s1.length(); i++) {

			for (int j = 1; j <= s2.length(); j++) {

				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					
					dp[i][j] = 1 + dp[i - 1][j - 1];
					
				}
				maxCount = Math.max(maxCount, dp[i][j]);
			}

		}

		System.out.println(maxCount);
	}

}
