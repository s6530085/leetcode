package me.sunmin.algorithm;
//https://leetcode.com/problems/ransom-note/
//Runtime: 6 ms, faster than 98.66% of Java online submissions for Ransom Note.

public class P383_RansomNote {
	
	public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) return false;
		char rs[] = ransomNote.toCharArray();
		char ms[] = magazine.toCharArray();
		int counts[] = new int[26];
		for (char c : ms) {
			counts[c - 'a']++;
		}
		for (char c : rs) {
			counts[c - 'a']--;
			if (counts[c - 'a'] < 0) return false;
		}
		return true;
    }
}
