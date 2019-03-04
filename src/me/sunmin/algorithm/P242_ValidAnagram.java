package me.sunmin.algorithm;
//https://leetcode.com/problems/valid-anagram/
//Runtime: 2 ms, faster than 97.06% of Java online submissions for Valid Anagram.


public class P242_ValidAnagram {
	
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) return false;
		int counts[] = new int[26];
		char cs[] = s.toCharArray();
		char ts[] = t.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			counts[cs[i]-'a']++;
			counts[ts[i]-'a']--;
		}
		for (int i =0; i < 26; i++) {
			if (counts[i] != 0) return false;
		}
		return true;
    }
	
}
