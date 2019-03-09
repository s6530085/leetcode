package me.sunmin.algorithm;
//https://leetcode.com/problems/first-unique-character-in-a-string/
//Runtime: 7 ms, faster than 98.39% of Java online submissions for First Unique Character in a String.

public class P387_FirstUniqueCharacterString {
	public int firstUniqChar(String s) {
		char cs[] = s.toCharArray();
		int counts[] = new int[26];
		for (char c : cs) {
			counts[c-'a']++;
		}
		for (int i = 0; i < cs.length; i++) {
			if (counts[cs[i]-'a'] == 1) return i;
		}
		return -1;
    }

}
