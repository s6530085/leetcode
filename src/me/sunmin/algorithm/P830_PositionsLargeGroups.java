package me.sunmin.algorithm;
//https://leetcode.com/problems/positions-of-large-groups/
//Runtime: 6 ms, faster than 100.00% of Java online submissions for Positions of Large Groups.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class P830_PositionsLargeGroups {
	
	public List<List<Integer>> largeGroupPositions(String S) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int length = S.length();
		int l = 1;
		for (int i = 1; i < length; i++) {
			if (S.charAt(i) == S.charAt(i-1)) {
				l++;
				if (i == length - 1) {
					if (l > 2) {
						list.add(Arrays.asList(i-l+1, i));
					}
				}
			}
			else {
				if (l > 2) {
					List<Integer> li = new ArrayList<Integer>();
					li.add(i-l);
					li.add(i-1);
					list.add(li);
				}
				l = 1;
			}
		}
		return list;
    }
	
	
	public static void main(String[] args) {
		P830_PositionsLargeGroups p = new P830_PositionsLargeGroups();
		List<List<Integer>> l = p.largeGroupPositions("abcdddeeeeaabbbcd");
		
	}
}
