package me.sunmin.algorithm;
//https://leetcode.com/problems/wiggle-subsequence/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Wiggle Subsequence.

public class P376_WiggleSubsequence {
	
	public int wiggleMaxLength(int[] nums) {
		if (nums.length < 2) return nums.length;
		int lastDiffIndex = 0;
		int l = 1;
		boolean lastDiff = true;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i-1]) continue;
			boolean diff = nums[i] > nums[lastDiffIndex];
			if (l == 1) {
				l++;
				lastDiff = diff;
			}
			else if (diff != lastDiff) {
				l++;
				lastDiff = diff;
			}
			lastDiffIndex = i;
		}
		
		return l;
    }
	
	
	public static void main(String[]args) {
		P376_WiggleSubsequence w = new P376_WiggleSubsequence();
		int i = w.wiggleMaxLength(new int[] {1,17,5,10,13,15,10,5,16,8});
	}
}
