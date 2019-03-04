package me.sunmin.algorithm;
//https://leetcode.com/problems/move-zeroes/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Move Zeroes.


public class P283_MoveZeroes {
	public void moveZeroes(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int v = nums[i];
			if (v == 0) {
				count++;
			}
			else {
				if (count > 0) {
					nums[i-count] = v;
				}
			}
		}
		for (int i = nums.length - count; i < nums.length; i++) {
			nums[i] = 0;
		}
    }
}
