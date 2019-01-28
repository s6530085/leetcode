package me.sunmin.algorithm;
//https://leetcode.com/problems/remove-element/
//Runtime: 4 ms, faster than 100.00% of Java online submissions for Remove Element.

public class P027_RemoveElement {
	public int removeElement(int[] nums, int val) {
        int lo = 0;
		int hi = nums.length-1;
		while(lo <= hi) {
			int current = nums[lo];
			if (current == val) {
				while(lo <= hi) {
					if (nums[hi] != val) {
						nums[lo] = nums[hi];
						nums[hi] = val;
						lo++;
						hi--;
						break;
					}
					else {
						hi--;
					}
				}
			}
			else {
				lo++;
			}
		}
		return lo;

    }
}
