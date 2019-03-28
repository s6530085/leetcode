package me.sunmin.algorithm;
//https://leetcode.com/problems/longest-continuous-increasing-subsequence/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Longest Continuous Increasing Subsequence.


public class P674_LongestContinuousIncreasingSubsequence {
	
	public int findLengthOfLCIS(int[] nums) {
		if (nums == null || nums.length == 0) return 0;
        int length = 1;
        int longest = 0;
        for (int i = 0; i < nums.length-1; i++) {
        	if (nums[i] < nums[i+1]) {
        		length++;
        	}
        	else {
        		if (length > longest) {
        			longest = length;
        		}
        		length = 1;
        	}
        }
        return Math.max(longest, length);
    }
	
}
