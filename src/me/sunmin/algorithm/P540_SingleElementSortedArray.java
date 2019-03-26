package me.sunmin.algorithm;
//https://leetcode.com/problems/single-element-in-a-sorted-array/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Element in a Sorted Array.

public class P540_SingleElementSortedArray {

	public int singleNonDuplicate(int[] nums) {
		if (nums[0] != nums[1]) return nums[0];
		if (nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];
		int lo = 1;
		int hi = nums.length - 2;
		while(lo <= hi) {
			int mid = lo + (hi - lo)/2;
			int mv = nums[mid];
			int lv = nums[mid-1];
			int rv = nums[mid+1];
			if (lv != mv && rv != mv) {
				return mv;
			}
			else {
				if (lv == mv) {
					if ((mid & 1) == 0) {
						hi = mid - 1;
					}
					else {
						lo = mid + 1;
					}
				}
				else {
					if ((mid & 1) == 0) {
						lo = mid + 1;
					}
					else {
						hi = mid - 1;
					}
				}
			}
			
		}
		return lo;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
