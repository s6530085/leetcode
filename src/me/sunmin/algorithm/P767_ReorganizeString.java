package me.sunmin.algorithm;

import java.util.Arrays;

//https://leetcode.com/problems/reorganize-string/
//Runtime: 3 ms, faster than 95.42% of Java online submissions for Reorganize String.

public class P767_ReorganizeString {
	public String reorganizeString(String S) {
		int[] counts = new int[26];
		for (int i = 0; i < S.length(); i++) {
			counts[S.charAt(i)-'a'] += 100;
		}
		for (int i = 0; i < counts.length; i++) {
			if (counts[i]/100 > (S.length()+1)/2) return "";
			counts[i] += i;
		}
		Arrays.sort(counts);

		char[] cs = new char[S.length()];
        int index = 0;
        for (int i = counts.length-1; i >= 0; i--) {
        	int count = counts[i] / 100;
        	if (count == 0) break;
        	char c = (char) (counts[i]%100 + 'a');
        	while(count>0) {
        		cs[index] = c;
        		index += 2;
        		if (index >= S.length()) index = 1;
        		count--;
        	}
        }
        return new String(cs);
    }
	
	public static void main(String[] args) {
		P767_ReorganizeString r  = new P767_ReorganizeString();
		String s = r.reorganizeString("aab");
	}
}
