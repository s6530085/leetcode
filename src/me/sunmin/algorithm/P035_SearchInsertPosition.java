package me.sunmin.algorithm;
//https://leetcode.com/problems/search-insert-position/
//Runtime: 2 ms, faster than 100.00% of Java online submissions for Search Insert Position.

public class P035_SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
        int lo = 0;
		int hi = nums.length-1;
		while(lo <= hi) {
			int middle = lo + ((hi - lo) >> 1);
			int middleValue = nums[middle];
			if (middleValue == target) {
				return middle;
			}
			else if (middleValue < target) {
				lo = middle+1;
			}
			else {
				hi = middle-1;
			}
		}
		if (lo >= nums.length) {
			return lo;
		}
		if (hi < 0) {
			return 0;
		}
		if (nums[lo] < target) {
			return lo+1;
		}
		else if (nums[hi] > target) {
			if (hi == 0) {
				return 0;
			}
			else {
				return hi-1;
			}
		}
		else {
			return lo;
		}

    }
}
