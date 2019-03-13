package me.sunmin.algorithm;
//https://leetcode.com/problems/detect-capital/
//Runtime: 9 ms, faster than 100.00% of Java online submissions for Detect Capital.

public class P520_DetectCapital {
	public boolean detectCapitalUse(String word) {

		boolean lastIsBig = false;
		int length = word.length();
		for (int i = 0; i < length; i++) {
			char c = word.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				if (i > 0) {
					if (!lastIsBig) return false;
				}
				lastIsBig = true;
			}
			else {
				if (i > 0) {
					if (lastIsBig && i > 1) return false;
				}
				lastIsBig = false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		P520_DetectCapital d = new P520_DetectCapital();
		boolean b = d.detectCapitalUse("USA");
		b = d.detectCapitalUse("Google");
		b = d.detectCapitalUse("leetcode");
		b = d.detectCapitalUse("AaA");
	}
}
