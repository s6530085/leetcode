package me.sunmin.algorithm;
//https://leetcode.com/problems/valid-palindrome/
//Runtime: 5 ms, faster than 77.86% of Java online submissions for Valid Palindrome.

public class P125_ValidPalindrome {
	
	public boolean isPalindrome(String s) {
		char cs[] = s.toLowerCase().toCharArray();
		int lo = 0;
		int hi = cs.length - 1;
		while (lo < hi) {
			char cl = cs[lo];
			char ch = cs[hi];
			if (Character.isLetterOrDigit(cl) && Character.isLetterOrDigit(ch)) {
				if (cl != ch) {
					return false;
				}
				else {
					lo++;
					hi--;
				}
			}
			else {
				if (!Character.isLetterOrDigit(cl)) {
					lo++;
				}
				if (!Character.isLetterOrDigit(ch)) {
					hi--;
				}
			}
		}
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P125_ValidPalindrome v = new P125_ValidPalindrome();
		boolean b = v.isPalindrome("A man, a plan, a canal: Panama");

	}

}
