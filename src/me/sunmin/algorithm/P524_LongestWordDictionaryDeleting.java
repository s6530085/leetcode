package me.sunmin.algorithm;

import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
//Runtime: 25 ms, faster than 77.19% of Java online submissions for Longest Word in Dictionary through Deleting.

public class P524_LongestWordDictionaryDeleting {
	public String findLongestWord(String s, List<String> d) {
		String longest = "";
		int ll = 0;
		char cs[] = s.toCharArray();
		int sl = cs.length;
		for(String ds : d) {
			int dl = ds.length();
			if (sl < dl) continue;
			int i = 0;
			int j = 0;
			while(j < sl) {
				if (ds.charAt(i) == cs[j]) {
					i++;
					j++;
				}
				else {
					j++;
				}
				if (i == dl) {
					if (dl > ll) {
						longest = ds;
						ll = dl;
					}
					else if (dl == ll) {
						if (ds.compareTo(longest) < 0) {
							longest = ds;
							ll = dl;
						}
					}
					break;
				}
			}
		}
		
		return longest;
    }
	
	public static void main(String[] args) {
		int i = "bar".compareTo("foo");
		P524_LongestWordDictionaryDeleting d = new P524_LongestWordDictionaryDeleting();
		String s = d.findLongestWord("abpcplea", Arrays.asList("ale","apple","monkey","plea"));
	}
}
