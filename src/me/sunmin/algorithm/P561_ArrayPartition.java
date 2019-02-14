package me.sunmin.algorithm;

import java.util.Arrays;
//https://leetcode.com/problems/array-partition-i/
//Runtime: 21 ms, faster than 84.78% of Java online submissions for Array Partition I.

public class P561_ArrayPartition {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			sum += nums[i];
		}
		return sum;
    }
}
