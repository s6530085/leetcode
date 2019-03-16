package me.sunmin.algorithm;
//https://leetcode.com/problems/backspace-string-compare/
//Runtime: 4 ms, faster than 90.45% of Java online submissions for Backspace String Compare.

public class P844_BackspaceStringCompare {
	public boolean backspaceCompare(String S, String T) {
		StringBuilder ss = new StringBuilder();
		StringBuilder st = new StringBuilder();
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == '#') {
				if (ss.length() > 0) {
					ss.deleteCharAt(ss.length()-1);
				}	
			}
			else {
				ss.append(c);
			}
		}
		for (int i = 0; i < T.length(); i++) {
			char c = T.charAt(i);
			if (c == '#') {
				if (st.length() > 0) {
					st.deleteCharAt(st.length()-1);
				}
			}
			else {
				st.append(c);
			}
		}
		
		return ss.toString().equals(st.toString());
    }
	
	public static void main(String[] args) {
		P844_BackspaceStringCompare p = new P844_BackspaceStringCompare();
		boolean b = p.backspaceCompare("y#fo##f", "y#fx#o##f");
	}
}
