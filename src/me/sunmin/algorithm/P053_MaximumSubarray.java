package me.sunmin.algorithm;
//https://leetcode.com/problems/maximum-subarray/
//Runtime: 7 ms, faster than 58.33% of Java online submissions for Maximum Subarray.

public class P053_MaximumSubarray {
	public int maxSubArray(int[] nums) {
        int maxV = Integer.MIN_VALUE;
		int cV = 0;
		boolean begin = false;
		for (int i = 0; i < nums.length; i++) {
			int value = nums[i];
			if (value <= 0) {
				if (!begin) {
					if (value > maxV)   maxV = value;
				}
				else {
					cV += value;
					if (cV <= 0) {
						cV = 0;
						begin = false;
					}
				}
			}
			else {
				begin = true;
				cV += value;
				if (cV > maxV) {
					maxV = cV;
				}
			}
		}
		return maxV;

    }
}
