package me.sunmin.algorithm;
//https://leetcode.com/problems/permutation-sequence/
//Runtime: 8 ms, faster than 68.00% of Java online submissions for Permutation Sequence.

import java.util.ArrayList;
import java.util.List;

public class P060_PermutationSequence {
	
	private int fact(int n) {
		switch(n) {
		case 1:
			return 1;
		case 2:
			return 1;
		case 3:
			return 2;
		case 4:
			return 6;
		case 5:
			return 24;
		case 6:
			return 120;
		case 7:
			return 720;
		case 8:
			return 5040;
		case 9:
			return 40320;
		}
		return 0;
	}
	
	
	
	public String getPermutation(int n, int k) {
		if (n == 1)	return "1";
		k--;
		String s = "";
		List<String> ls = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			ls.add(String.valueOf(i));
		}
		while(!ls.isEmpty()) {
			int f = fact(n);
			if (k >= f) {
				s += ls.remove(k/f);
				k %= f;
			}
			else {
				s += ls.remove(0);
			}
			n--;
		}
		
		return s;
    }
	
	public static void main(String[] args) {
		P060_PermutationSequence p = new P060_PermutationSequence();
		String i = p.getPermutation(3, 3);
	}
}
