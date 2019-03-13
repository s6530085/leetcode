package me.sunmin.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/relative-ranks/
//Runtime: 8 ms, faster than 79.97% of Java online submissions for Relative Ranks.

public class P506_RelativeRanks {
	public String[] findRelativeRanks(int[] nums) {
		Map <Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		int sorted[] = Arrays.copyOf(nums, nums.length);
		Arrays.sort(sorted);
		String[]ss = new String[nums.length];
		for (int j = 0; j < sorted.length; j++) {
			int i = map.get(sorted[j]);
			if (j == nums.length - 1) {
				ss[i] = "Gold Medal";
			}
			else if (j == nums.length - 2) {
				ss[i] = "Silver Medal";
			}
			else if (j == nums.length - 3) {
				ss[i] = "Bronze Medal";
			}
			else {
				ss[i] = "" + (nums.length - j);
			}
		}
		return ss;
    }
}
