package me.sunmin.algorithm;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-harmonious-subsequence/
//Runtime: 32 ms, faster than 91.82% of Java online submissions for Longest Harmonious Subsequence.


public class P594_LongestHarmoniousSubsequence {
	public int findLHS(int[] nums) {
		if (nums == null || nums.length == 0) return 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int n : nums) {
			map.put(n, 1+map.getOrDefault(n, 0));
		}
		int longest = Integer.MIN_VALUE;
		for (int i : map.keySet()) {
			int l = map.get(i);
			int j = map.getOrDefault(i+1, 0);
			if (l+j > longest) {
				longest = l+j;
			}
		}
		
		return longest;
    }
}
