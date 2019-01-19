package me.sunmin.algorithm;
//https://leetcode.com/problems/unique-morse-code-words/
//Runtime: 9 ms, faster than 64.49% of Java online submissions for Unique Morse Code Words.

import java.util.HashSet;
import java.util.Set;

public class P804_UniqueMorseCodeWords {
	private static final String[]codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

	public int uniqueMorseRepresentations(String[] words) {
		Set<String>set = new HashSet<String>();
		for (String word : words) {
			String s = "";
			char []cs = word.toCharArray();
			for (int i = 0; i < cs.length; i++) {
				s += codes[cs[i] - 'a'];
			}
			set.add(s);
		}
		return set.size();
	}
}
