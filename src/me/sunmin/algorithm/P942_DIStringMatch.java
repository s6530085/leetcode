package me.sunmin.algorithm;
//https://leetcode.com/problems/di-string-match/
//Runtime: 9 ms, faster than 93.01% of Java online submissions for DI String Match.

public class P942_DIStringMatch {
	public int[] diStringMatch(String S) {
        int l = S.length();
		int ls[] = new int[l+1];
		int currentMin = 0;
		int currentMax = l;
		char cs[] = S.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] == 'I') {
				ls[i] = currentMin++;
			}
			else {
				ls[i] = currentMax--;
			}
		}
		ls[l] = currentMin;
		return ls;
    }
}
