package me.sunmin.algorithm;
//https://leetcode.com/problems/isomorphic-strings/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Isomorphic Strings.

public class P205_IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		char cs[] = s.toCharArray();
		char ts[] = t.toCharArray();
		if (cs.length != ts.length) return false;
		int count[] = new int[256];
		int diff = 0;
		for (int i = 0; i < cs.length; i++) {
			if (count[cs[i]] == count[ts[i]+128]) {
				if (count[cs[i]] == 0) {
					diff++;
					count[cs[i]] = diff;
					count[ts[i]+128] = diff;
				}
			}
			else {
				return false;
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		P205_IsomorphicStrings s = new P205_IsomorphicStrings();
		boolean b = s.isIsomorphic("abb", "caa");
	}
}
