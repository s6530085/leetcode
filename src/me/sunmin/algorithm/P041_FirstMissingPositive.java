package me.sunmin.algorithm;
//https://leetcode.com/problems/first-missing-positive/
//Runtime: 5 ms, faster than 100.00% of Java online submissions for First Missing Positive.

public class P041_FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
        int maxP = Integer.MIN_VALUE;
		for (int i : nums) {
			if (i > maxP) {
				maxP = i;
			}
		}
		if (maxP <= 0) return 1;
		int bits[] = new int[maxP/32+1];
		for (int i = 0; i < nums.length; i++) {
			int value = nums[i]-1;
			if(value >= 0) {
				bits[value/32] |= 1 << (value % 32);
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if ((bits[i/32] & (1 << (i%32))) == 0) {
				return i+1;
			}
		}
		
		return nums.length+1;

    }
}
