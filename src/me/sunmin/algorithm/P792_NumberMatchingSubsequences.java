package me.sunmin.algorithm;
//https://leetcode.com/problems/number-of-matching-subsequences/
//Runtime: 62 ms, faster than 84.32% of Java online submissions for Number of Matching Subsequences.

import java.util.ArrayList;
import java.util.List;

public class P792_NumberMatchingSubsequences {
	public int numMatchingSubseq(String S, String[] words) {
		List<Integer>[] list = (List<Integer> [])new ArrayList[26];
		int l = S.length();
		for (int i = 0; i < l; i++) {
			int index = S.charAt(i) - 'a';
			List<Integer>li = list[index];
			if (li == null) {
				li = new ArrayList<Integer>();
				list[index] = li;
			}
			li.add(i);
		}
		
		int count = 0;
		for (String word:words) {
			int ll = word.length();
			int matched = 0;
			int last = -1;
			for (int i = 0; i < ll; i++) {
				int index = word.charAt(i) - 'a';
				List<Integer> li = list[index];
				if (li == null) {
					break;
				}
				for (int j : li) {
					if (j > last) {
						last = j;
						matched++;
						break;
					}
				}
			}
			if (matched == ll) count++;
		}
		
		return count;
		
		
//		int count = 0;
//		for (String word : words) {
//			int l = word.length();
//			int sl = S.length();
//			int begin = 0;
//			int matched = 0;
//			for (int i = 0; i < l; i++) {
//				char wc = word.charAt(i);
//				for (int j = begin; j < sl; j++) {
//					if (S.charAt(j) == wc) {
//						begin = j+1;
//						matched++;
//						break;
//					}
//				}
//			}
//			if (matched == l) count++;
//		}
//		return count;
    }
	
	public static void main(String[] args) {
		P792_NumberMatchingSubsequences s = new P792_NumberMatchingSubsequences();
		int i = s.numMatchingSubseq("abcde", new String[] {"a","bb","acd","ace"});
	}
}
