package me.sunmin.algorithm;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
//Runtime: 6 ms, faster than 95.33% of Java online submissions for Remove Duplicates from Sorted Array II.

public class P080_RemoveDuplicatesFromSortedArray2 {
	public int removeDuplicates(int[] nums) {
		if (nums.length <= 2) return nums.length;
		int index = 2;
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] == nums[index-2]) {
				continue;
			}
			else {
				nums[index] = nums[i];
				index++;
			}
		}
		return index;
    }
	
	public static void main(String[] args) {
		P080_RemoveDuplicatesFromSortedArray2 s = new  P080_RemoveDuplicatesFromSortedArray2();
		int i = s.removeDuplicates(new int[] {0,0,1,1,1,1,2,3,3});
	}
}
