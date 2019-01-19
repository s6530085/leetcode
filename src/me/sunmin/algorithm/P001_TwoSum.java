//https://leetcode.com/problems/two-sum/
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

package me.sunmin.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P001_TwoSum {
	
	static public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int minus = target - nums[i];
			if (m.containsKey(minus)) {
				return new int[] {m.get(minus), i};
			}
			m.put(nums[i], i);
		}
		
		return null;
	}

	public static void main(String[] args) {
		int[] r = P001_TwoSum.twoSum(new int[]{2,5,5,15}, 10);
		System.out.println(Arrays.toString(r));

	}

}
