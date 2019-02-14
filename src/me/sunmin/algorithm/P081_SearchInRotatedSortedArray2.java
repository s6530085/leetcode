package me.sunmin.algorithm;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
//Runtime: 1 ms, faster than 42.16% of Java online submissions for Search in Rotated Sorted Array II.


public class P081_SearchInRotatedSortedArray2 {

	public boolean search(int[] nums, int target) {
		int pivot = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= min) {
				if (i == 0 || nums[i-1] != nums[i]) {
					pivot = i;
					min = nums[i];
				}
			}
		}
		
		int l = nums.length;
		int lo = pivot;
		int hi = pivot + l - 1;
		while (lo <= hi) {
			int middle = lo + ((hi - lo) >> 1);
			int middleValue = nums[middle%l];
			if (middleValue == target) {
				return true;
			}
			else if (middleValue < target) {
				boolean hasNext = false;
				while (middle <= hi) {
					middle++;
					if (nums[middle%l] == middleValue) {
						continue;
					}
					else {
						hasNext = true;
						lo = middle;
						break;
					}
				}
				if (!hasNext) return false;
			}
			else {
				boolean hasNext = false;
				while (lo <= middle) {
					middle--;
					if (middle >= 0 ) {
						if (nums[middle%l] == middleValue) {
							continue;
						}
						else {
							hasNext = true;
							hi = middle;
							break;
						}
					}
					else {
						return false;
					}
				}
				if (!hasNext) return false;
			}
		}
		return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P081_SearchInRotatedSortedArray2 s = new P081_SearchInRotatedSortedArray2();
		boolean b = s.search(new int[] {1,3,1,1,1}, 3);
		b = s.search(new int[] {2,5,6,0,0,1,2}, 3);
	}

}
