package me.sunmin.algorithm;
//https://leetcode.com/problems/find-peak-element/
//Runtime: 2 ms, faster than 100.00% of Java online submissions for Find Peak Element.

public class P162_FindPeakElement {
	public int findPeakElement(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int v = nums[i];
			boolean left = (i == 0 ? true : v > nums[i-1]);
			boolean right = (i == nums.length-1 ? true : v > nums[i+1]);
			if (left && right) {
				return i;
			}
		}
		return -1;
    }
}
