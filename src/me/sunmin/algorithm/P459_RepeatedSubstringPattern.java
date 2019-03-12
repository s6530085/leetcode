package me.sunmin.algorithm;
//https://leetcode.com/problems/repeated-substring-pattern/
//Runtime: 9 ms, faster than 98.25% of Java online submissions for Repeated Substring Pattern.

public class P459_RepeatedSubstringPattern {
	public boolean repeatedSubstringPattern(String s) {
		int length = s.length();
        for (int i = 1; i <= length/2; i++) {
            if (length % i != 0) continue;
			String p = s.substring(0, i);
			boolean match = true;
			for (int begin = i; begin < length; begin += i) {
				String t = s.substring(begin, begin+i);
				if (!t.equals(p)) {
					match = false;
					break;
				}
			}
			if (match) return true;
		}
		return false;
    }
	
	public static void main(String[]args) {
		P459_RepeatedSubstringPattern p = new P459_RepeatedSubstringPattern();
		boolean b = p.repeatedSubstringPattern("abac");
	}
}
