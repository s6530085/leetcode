package me.sunmin.algorithm;

import java.util.Arrays;

//https://leetcode.com/problems/longest-increasing-subsequence/
//

public class P300_LongestIncreasingSubsequence {
	
	public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int lis[] = new int[nums.length];
        lis[0] = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
        	int m = 1;
        	for (int j = 0; j < i; j++) {
        		if (nums[j] < nums[i]) {
        			m = Math.max(lis[j]+1, m);
        		}
        	}
        	max = Math.max(m, max);
        	lis[i] = m;
        }
        return max;
    }
	
	public static void main(String[] args) {
		P300_LongestIncreasingSubsequence l = new P300_LongestIncreasingSubsequence();
		int i = l.lengthOfLIS(new int[] {10,9,2,5,3,7,101,18,1});
	}
}

