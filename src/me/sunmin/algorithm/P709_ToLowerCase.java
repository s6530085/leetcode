package me.sunmin.algorithm;
//https://leetcode.com/problems/to-lower-case/
//Runtime: 1 ms, faster than 97.64% of Java online submissions for To Lower Case.

public class P709_ToLowerCase {
	public String toLowerCase(String str) {
        char[] cs = str.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];
			if (c >= 'A' && c <= 'Z') {
				cs[i] = (char) (c + 32);
			}
		}
		return new String(cs);

    }
}
