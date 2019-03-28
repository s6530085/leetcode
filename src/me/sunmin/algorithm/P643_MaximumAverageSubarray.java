package me.sunmin.algorithm;
//https://leetcode.com/problems/maximum-average-subarray-i/
//Runtime: 3 ms, faster than 99.94% of Java online submissions for Maximum Average Subarray I.

public class P643_MaximumAverageSubarray {
	public double findMaxAverage(int[] nums, int k) {
		double sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}
		double max = sum;
		for (int i = 1; i < nums.length - k + 1; i++) {
			sum -= nums[i-1];
			sum += nums[i+k-1];
			if (sum > max) {
				max = sum;
			}
		}
		
		return max/k;
    }
}
