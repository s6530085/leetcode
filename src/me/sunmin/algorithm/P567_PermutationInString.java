package me.sunmin.algorithm;

import java.util.Arrays;

//https://leetcode.com/problems/permutation-in-string/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Permutation in String.

public class P567_PermutationInString {
	public boolean checkInclusion(String s1, String s2) {
		int s1l = s1.length();
		int s2l = s2.length();
		if (s1l > s2l) return false;
        int[] pattern = new int[26];
        for (int i = 0; i < s1l; i++) {
        	pattern[s1.charAt(i)-'a']++;
        }
        
        int[] match = new int[26];
        for (int i = 0; i < s1l; i++) {
        	match[s2.charAt(i) - 'a']++;
        	if (Arrays.equals(pattern, match)) return true;
        }
        for (int i = 1; i < s2l-s1l+1; i++) {
        	match[s2.charAt(i-1)-'a']--;
        	match[s2.charAt(i+s1l-1)-'a']++;
        	if (Arrays.equals(pattern, match)) return true;
        }
        return false;
    }
}
