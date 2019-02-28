package me.sunmin.algorithm;
//https://leetcode.com/problems/maximum-gap/
//Runtime: 4 ms, faster than 84.30% of Java online submissions for Maximum Gap.

import java.util.Arrays;

public class P164_MaximumGap {

	public int maximumGap(int[] nums) {
		if (nums.length < 2) return 0;
		Arrays.sort(nums);
		int gap = -1;
		for (int i = 0; i < nums.length - 1; i++) {
			int g = nums[i+1] -nums[i];
			if (g > gap) {
				gap = g;
			}
		}
		return gap;
    }
}
