package me.sunmin.algorithm;

import java.util.Arrays;

//https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
//Runtime: 7 ms, faster than 99.64% of Java online submissions for Shortest Unsorted Continuous Subarray.

public class P581_ShortestUnsortedContinuousSubarray {

	public int findUnsortedSubarray(int[] nums) {
		if (nums == null || nums.length < 2) return 0;
		int[] copy = nums.clone();
		Arrays.sort(copy);
		
		int lo = 0;
		int hi = nums.length - 1;
		while((lo <= hi) && (copy[lo] == nums[lo])) lo++;
        if (lo == hi) return 0;
		while((hi >= lo) && (copy[hi] == nums[hi])) hi--;
		return hi - lo + 1;
    }

	public static void main(String[] args) {
		P581_ShortestUnsortedContinuousSubarray s = new P581_ShortestUnsortedContinuousSubarray();
		int i = s.findUnsortedSubarray(new int[] {2, 6, 4, 8, 10, 9, 15});
		// TODO Auto-generated method stub

	}

}
