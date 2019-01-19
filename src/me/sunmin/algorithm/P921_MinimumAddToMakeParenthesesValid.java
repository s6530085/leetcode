package me.sunmin.algorithm;
//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
//Runtime: 8 ms, faster than 76.52% of Java online submissions for Minimum Add to Make Parentheses Valid.

public class P921_MinimumAddToMakeParenthesesValid {
	public int minAddToMakeValid(String S) {
        int unmatchLeft = 0;
		int unmatchRight = 0;
		char[] cs = S.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];
			if (c == '(') {
				unmatchLeft++;
			}
			else {
				if (unmatchLeft > 0) {
					unmatchLeft--;
				}
				else {
					unmatchRight++;
				}
			}
		}
		return unmatchLeft + unmatchRight;

    }
}
