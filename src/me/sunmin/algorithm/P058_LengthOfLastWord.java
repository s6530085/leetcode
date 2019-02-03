package me.sunmin.algorithm;
//https://leetcode.com/problems/length-of-last-word/
//Runtime: 2 ms, faster than 100.00% of Java online submissions for Length of Last Word.

public class P058_LengthOfLastWord {
	public int lengthOfLastWord(String s) {
        int l = 0;
		char cs[] = s.toCharArray();
		for (int i = cs.length-1; i >= 0; i--) {
			if (cs[i] != ' ') {
				l++;
			}
			else {
				if (l > 0) {
					break;
				}
			}
		}
		return l;
    }
}
