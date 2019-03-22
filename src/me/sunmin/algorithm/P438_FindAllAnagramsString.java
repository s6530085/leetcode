package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/
//Runtime: 8 ms, faster than 92.90% of Java online submissions for Find All Anagrams in a String.

public class P438_FindAllAnagramsString {
	
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer>list = new ArrayList<Integer>();
		int pl = p.length();
	    int sl = s.length();
        if (pl > sl) return list;
		int[] ps = new int[26];
		for (int i = 0; i < pl; i++) {
			ps[p.charAt(i)-'a']++;
		}
		int[]ss = new int[26];
		for (int i = 0; i < pl; i++) {
			ss[s.charAt(i)-'a']++;
		}
		if (Arrays.equals(ps, ss)) list.add(0);
		for (int i = 1; i < sl-pl+1; i++) {
			ss[s.charAt(i-1) - 'a']--;
			ss[s.charAt(i+pl-1) - 'a']++;
			if (Arrays.equals(ps, ss)) list.add(i);
		}
		
		return list;
    }
	
}
