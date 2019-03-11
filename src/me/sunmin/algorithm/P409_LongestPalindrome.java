package me.sunmin.algorithm;
//https://leetcode.com/problems/longest-palindrome/
//Runtime: 4 ms, faster than 99.22% of Java online submissions for Longest Palindrome.

public class P409_LongestPalindrome {
	
	public int longestPalindrome(String s) {
		char cs[] = s.toCharArray();
		int counts[] = new int[52];
		for (char c : cs) {
			if (c >= 'a' && c <= 'z') counts[c-'a']++;
			else counts[c-'A'+26]++;
		}
		boolean hasOdd = false;
		int sum = 0;
		for (int i : counts) {
			if ((i & 1) == 0) {
				sum += i;
			}
			else {
				hasOdd = true;
				sum += i-1;
			}
		}
		return sum + (hasOdd ? 1 : 0);
    }
	
	public static void main(String[] args) {
		P409_LongestPalindrome p = new P409_LongestPalindrome();
		int i = p.longestPalindrome("abccccdd");
	}
}
