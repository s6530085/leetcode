package me.sunmin.algorithm;
//https://leetcode.com/problems/max-consecutive-ones/
//Runtime: 4 ms, faster than 92.89% of Java online submissions for Max Consecutive Ones.

public class P485_MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		int l = 0;
		boolean inOne = false;
		int begin = 0;
		for (int i = 0;i < nums.length; i++) {
			if (nums[i] == 1) {
				if (!inOne) {
					begin = i;
					inOne = true;
				}
				if (i == nums.length - 1) {
					int length = (!inOne ? 1 : i - begin+1);
					if (length > l) l = length;
				}
			}
			else {
				if (inOne) {
					int length = i - begin;
					if (length > l) l = length;
					inOne = false;
				}
			}
		}
		return l;
    }
}
