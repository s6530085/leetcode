package me.sunmin.algorithm;
//https://leetcode.com/problems/palindrome-partitioning/
//Runtime: 5 ms, faster than 53.47% of Java online submissions for Palindrome Partitioning.

import java.util.ArrayList;
import java.util.List;

public class P131_PalindromePartitioning {
	
	private static boolean p(String s) {
		int l = s.length();
		for (int i = 0; i < l/2; i++) {
			if (s.charAt(i) != s.charAt(l - i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	
	
	private static void pp(String s, List<String>l, List<List<String>>list) {
		if (s.length() == 0) {
			list.add(l);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			String left = s.substring(0, i+1);
			if (p(left)) {
				List<String> nl = new ArrayList<String>(l);
				nl.add(left);
				pp(s.substring(i+1), nl, list);
			}
		}
	}
	
	public List<List<String>> partition(String s) {
		List<List<String>> list = new ArrayList<List<String>>();
        pp(s, new ArrayList<String>(), list);
        return list;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P131_PalindromePartitioning p = new P131_PalindromePartitioning();
		List<List<String>> l = p.partition("aab");
	}

}
