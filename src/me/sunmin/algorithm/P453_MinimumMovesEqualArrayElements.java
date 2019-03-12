package me.sunmin.algorithm;
//https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
//Runtime: 4 ms, faster than 100.00% of Java online submissions for Minimum Moves to Equal Array Elements.

public class P453_MinimumMovesEqualArrayElements {
	public int minMoves(int[] nums) {
		int count = 0;
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != min) {
				count += nums[i] - min;
			}
		}
		
		return count;
    }
}
