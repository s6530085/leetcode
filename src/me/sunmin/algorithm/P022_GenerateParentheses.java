package me.sunmin.algorithm;
//https://leetcode.com/problems/generate-parentheses/
//Runtime: 2 ms, faster than 67.91% of Java online submissions for Generate Parentheses.

import java.util.ArrayList;
import java.util.List;

public class P022_GenerateParentheses {
	private String ns(int n, String s) {
		String ss = "";
		for (int i = 0; i < n; i++) {
			ss += s;
		}
		return ss;
	}
	
	private void gene(int index, int remain, int total, String s, List<String> l) {
		if (index == total) {
			l.add(s+ns(remain, ")"));
		}
		else {
			for (int i = 0; i <= index; i++) {
				if (remain - i >= total - index) {
					String add = ns(i, ")");
					String added = s.subSequence(0, s.length()-(total-index)) 
							+ add + s.substring(s.length() - (total-index));
					gene(index+1, remain-i, total, added, l);
				}
			}
		}
	}
	
	public List<String> generateParenthesis(int n) {
		List<String> ps = new ArrayList<String>();
		gene(1, n, n, ns(n, "("), ps);
		return ps;
	}
}
