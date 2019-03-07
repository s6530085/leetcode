package me.sunmin.algorithm;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/word-pattern/
//Runtime: 1 ms, faster than 98.96% of Java online submissions for Word Pattern.

public class P290_WordPattern {
	public boolean wordPattern(String pattern, String str) {
		String[] ss = str.split(" ");
		if (ss.length != pattern.length()) return false;
		Map<Character, String> map = new HashMap<Character, String>();
		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			String ps = map.get(c);
			if (ps == null) {
				if (map.containsValue(ss[i])) {
					return false;
				}
				else {
					map.put(c, ss[i]);
				}
			}
			else {
				if (!ps.equals(ss[i])) {
					return false;
				}
			}
		}
		return true;
    }
}
