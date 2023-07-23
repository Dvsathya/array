//Java program to print Longest Palindrome in a String

import java.io.*;

class LongestPalindrome {
	static String longestPalin(String s)
	{

		int count = -1;
		String ans = "";

		int n = s.length();
		boolean[][] dp = new boolean[n][n];

		for (int g = 0; g < n; g++) {
			for (int i = 0, j = g; j < n; i++, j++) {
				if (g == 0) {
					dp[i][j] = true;
				}
				else if (g == 1) {
					if (s.charAt(i) == s.charAt(j)) {
						dp[i][j] = true;
					}
					else {
						dp[i][j] = false;
					}
				}
				else {
					if (s.charAt(i) == s.charAt(j)
						&& dp[i + 1][j - 1] == true) {
						dp[i][j] = true;
					}
					else {
						dp[i][j] = false;
					}
				}

				if (dp[i][j] == true
					&& count < s.substring(i, j + 1)
								.length()) {
					ans = s.substring(i, j + 1);
					count = ans.length();
				}
			}
		}
		return ans;
	}
	public static void main(String[] args)
	{
		String str = "babad";
		System.out.println(longestPalin(str));
	}
}
// This code is contributed by Raunak Singh

