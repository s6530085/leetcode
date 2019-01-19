package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/keyboard-row/
//Runtime: 3 ms, faster than 83.84% of Java online submissions for Keyboard Row.

public class P500_KeyboardRow {
	private static char[][] rows = {"1234567890".toCharArray(), "qwertyuiop".toCharArray(), "asdfghjkl".toCharArray(), "zxcvbnm".toCharArray()};
	
	private int charIndex(char c) {
		if (c >= 'A' && c <= 'Z') {
			c += 32;
		}
		for (int i = 0; i < rows.length; i++) {
			for (char ch : rows[i]) {
				if (ch == c) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public String[] findWords(String[] words) {
		List<String> ss = new ArrayList<String>();
		for (String word : words) {
			char[] cs = word.toCharArray();
			int lastIndex = charIndex(cs[0]);
			boolean addTo = true;
			for (int j = 1; j < cs.length; j++) {
				if (charIndex(cs[j]) != lastIndex) {
					addTo = false;
					break;
				}
			}
			if (addTo) {
				ss.add(word);
			}
		}
		String sz[] = new String[ss.size()];
		for (int i = 0; i < ss.size(); i++) {
			sz[i] = ss.get(i);
		}
		return sz;
	}
}
