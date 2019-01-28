package me.sunmin.algorithm;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//Runtime: 6 ms, faster than 97.86% of Java online submissions for Remove Duplicates from Sorted Array.

public class P026_RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
			return 0;
		}
		
		int distinct = 1;
		int lastValue = nums[0];
		int lastIndex = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != lastValue) {
				distinct++;
				lastValue = nums[i];
				nums[i] = nums[lastIndex];
				nums[lastIndex] = lastValue;
				lastIndex++;
			}
		}
		
		return distinct;

    }
}
