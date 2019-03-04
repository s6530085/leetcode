package me.sunmin.algorithm;
//https://leetcode.com/problems/missing-number/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.

public class P268_MissingNumber {
	
	public int missingNumber(int[] nums) {
		int min = nums[0];
		int sum = nums[0];
		int l = nums.length;
		for (int i = 1; i < l; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
			sum += nums[i];
		}
		int realSum = l + l * (l-1)/2;
		return realSum - sum;
    }
	
}
