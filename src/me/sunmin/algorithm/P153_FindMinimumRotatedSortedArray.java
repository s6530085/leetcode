package me.sunmin.algorithm;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.

public class P153_FindMinimumRotatedSortedArray {

	public int findMin(int[] nums) {
		if (nums.length == 1) return nums[0];
		int lo = 0; 
		int hi = nums.length - 1;
		while (lo < hi) {
			int loValue = nums[lo];
			int hiValue = nums[hi];
			if (loValue <= hiValue) return loValue;
			
			int middle = lo + (hi - lo) / 2;
			int middleValue = nums[middle];
			if (middleValue >= loValue) {
				if (middle < hi) {
					if (middleValue > nums[middle+1]) {
						return nums[middle+1];
					}
				}
				lo = middle;
			}
			else {
				if (middle >= lo) {
					if (middleValue < nums[middle-1]) {
						return middleValue;
					}
				}
				hi = middle;
			}
		}
		return 0;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P153_FindMinimumRotatedSortedArray p = new P153_FindMinimumRotatedSortedArray();
		int i = p.findMin(new int[] {2,1});
		i = p.findMin(new int[] {7,8,9,1,2,3,4,5,6});
	}

}
