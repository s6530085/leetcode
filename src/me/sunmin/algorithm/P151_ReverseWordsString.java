package me.sunmin.algorithm;

import java.util.Arrays;

//https://leetcode.com/problems/reverse-words-in-a-string/
//Runtime: 6 ms, faster than 58.89% of Java online submissions for Reverse Words in a String.

public class P151_ReverseWordsString {
	
	public String reverseWords(String s) {
		char cs[] = s.toCharArray();
		boolean inChar = false;
		int begin = 0;
		int end = 0;
        StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];
			if (c == ' ') {
				if (inChar) {
					end = i;
					inChar = false;
					sb.insert(0, Arrays.copyOfRange(cs, begin, end));
				}
				else {
					continue;
				}
			}
			else {
				if (!inChar) {
					if (sb.length() > 0) {
						sb.insert(0, ' ');
					}
					begin = i;
					inChar = true;
				}
			}
		}
		if (inChar) {
			sb.insert(0, Arrays.copyOfRange(cs, begin, cs.length));
		}
        return sb.toString();
    }

	public static void main(String[] args) {
		P151_ReverseWordsString r = new P151_ReverseWordsString();
		String s = r.reverseWords("the sky is blue");
		s = r.reverseWords("  hello world!  ");
	}

}
