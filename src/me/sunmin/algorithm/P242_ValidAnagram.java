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
	
	
	public int kmp(String s, String p) {
		char[] cs = s.toCharArray();
		char[] ps = p.toCharArray();
		int next[] = getNext(ps);
		int i = 0;
		int j = 0;
		while (i < cs.length && j < ps.length) {
			if (j == -1 || cs[i] == ps[j]) {
				i++;
				j++;
			}
			else {
				j = next[j];
			}
		}
		
		if (j == ps.length) return i-j;
		return -1;
	}
	
	public int[] getNext(char []cs) {
		int next[] = new int[cs.length];
		next[0] = -1;
		int i = 0, j = -1;

		while (i < cs.length-1)
		{
			if (j == -1 || cs[i] == cs[j])
			{
				++i;
				++j;
				next[i] = j;
			}	
			else
				j = next[j];
		}		
		return next;
	}
	
	public static void main(String[] args) {
		P242_ValidAnagram v = new P242_ValidAnagram();
		int r = v.kmp("ababababc", "ababc");
	}
}
