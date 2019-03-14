package me.sunmin.algorithm;
//https://leetcode.com/problems/binary-search/
//Runtime: 2 ms, faster than 99.95% of Java online submissions for Binary Search.

public class P704_BinarySearch {
	public int search(int[] nums, int target) {
		int lo = 0;
		int hi = nums.length-1;
		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			int midV = nums[mid];
			if (midV > target) hi = mid-1;
			else if (midV < target) lo = mid+1;
			else return mid;
		}
		return -1;
    }
}
