package me.sunmin.algorithm;
//https://leetcode.com/problems/sort-colors/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.


public class P075_SortColors {
	public void sortColors(int[] nums) {
        int ones = 0;
        int twos = 0;
        for (int i : nums) {
        	if (i == 0) {
        		ones++;
        	}
        	else if (i == 1) {
        		twos++;
        	}
        }
        for (int i = 0; i < nums.length; i++) {
        	if (i < ones) {
        		nums[i] = 0;
        	}
        	else if (i < ones + twos) {
        		nums[i] = 1;
        	}
        	else {
        		nums[i] = 2;
        	}
        }
    }
}
