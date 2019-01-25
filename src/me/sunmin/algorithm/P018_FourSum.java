package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//https://leetcode.com/problems/4sum/
//Runtime: 66 ms, faster than 33.04% of Java online submissions for 4Sum.
// todosm

public class P018_FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length - 3; i++) {
			for (int j = i+1; j < nums.length - 2; j++) {
				for (int k = j + 1; k < nums.length - 1; k++) {
					int fourth = target-nums[i]-nums[j]-nums[k];
					int index = Arrays.binarySearch(nums, k+1, nums.length, fourth);
					if (index >= 0) {
						List<Integer> ls = Arrays.asList(nums[i], nums[j], nums[k], fourth);
						if (!set.contains(ls)) {
							l.add(ls);
							set.add(ls);
						}
					}
				}
			}
		}
		return l;

    }
}
