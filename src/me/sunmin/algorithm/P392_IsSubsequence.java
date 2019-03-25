package me.sunmin.algorithm;
//https://leetcode.com/problems/is-subsequence/
//Runtime: 8 ms, faster than 86.63% of Java online submissions for Is Subsequence.

public class P392_IsSubsequence {
	public boolean isSubsequence(String s, String t) {
		int i = 0;
		int j = 0;
		for (; i < s.length(); i++) {
			char ic = s.charAt(i);
			boolean match = false;
			for (; j < t.length(); j++) {
				if (ic == t.charAt(j)) {
					match = true;
					j++;
					break;
				}
			}
			if (!match) return false;
		}
		return true;
    }
	
}
