package me.sunmin.algorithm;
//https://leetcode.com/problems/remove-outermost-parentheses/
//Runtime: 2 ms, faster than 98.10% of Java online submissions for Remove Outermost Parentheses.

public class P1021_RemoveOutermostParentheses {
	public String removeOuterParentheses(String S) {
		StringBuilder sb = new StringBuilder();
		int p = 0;
		int l = S.length();
		for (int i = 0; i < l; i++) {
			char c = S.charAt(i);
			if (c == '(') p++;
			else p--;
			if (p > 1 || (p == 1 && c == ')')) {
				sb.append(c);
			}
		}
		return sb.toString();
    }
}
