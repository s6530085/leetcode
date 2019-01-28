package me.sunmin.algorithm;
//https://leetcode.com/problems/search-in-rotated-sorted-array/
//Runtime: 6 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.

public class P033_SearchInRotatedSortedArray {
	
	private int offsetBinarySearch(int[] nums, int target, int offset) {
		int lo = offset;
		int hi = nums.length-1 + offset;
		while (lo <= hi) {
			int middle = (lo + (hi - lo) / 2);
			int middleValue = nums[middle%nums.length];
			if (middleValue == target) {
				return middle%nums.length;
			}
			else if (middleValue < target) {
				lo = middle + 1;
			}
			else {
				hi = middle-1;
			}
		}
		return -1;
	}
	
	
	public int search(int[] nums, int target) {
		int offset = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[i-1]) {
				offset = i;
				break;
			}
		}
		
		return offsetBinarySearch(nums, target, offset);
	}

}
