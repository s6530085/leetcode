package me.sunmin.algorithm;
//https://leetcode.com/problems/reconstruct-original-digits-from-english/
//Runtime: 5 ms, faster than 96.23% of Java online submissions for Reconstruct Original Digits from English.

public class P423_ReconstructOriginalDigitsFromEnglish {
	
	public String originalDigits(String s) {
		int[] counts = new int[26];
		for (int i = 0; i < s.length(); i++) {
			counts[s.charAt(i) - 'a']++;
		}
		
		int c6 = counts['x' - 'a'];
		int c4 = counts['u' - 'a'];
		int c2 = counts['w' - 'a'];
		int c0 = counts['z' - 'a'];
        int c8 = counts['g' - 'a'];
		int c3 = counts['r' - 'a'] - c0 - c4;
		int c7 = counts['s' - 'a'] - c6;
		int c5 = counts['v' - 'a'] - c7;
		int c1 = counts['o' - 'a'] - c0 - c2 - c4;
		int c9 = (counts['n' - 'a'] - c1 - c7)/2;
		int[] digits = {c0, c1, c2, c3, c4, c5, c6, c7, c8, c9};
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] > 0) {
				for (int j = 0; j < digits[i]; j++) {
					sb.append(i);
				}
			}
		}
		return sb.toString();
	}
	
}
