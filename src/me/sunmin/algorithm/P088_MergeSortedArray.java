package me.sunmin.algorithm;
//https://leetcode.com/problems/merge-sorted-array/
//Runtime: 2 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.

public class P088_MergeSortedArray {
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int index1 = m-1;
		int index2 = n-1;
		while(index1>=0 && index2>=0) {
			if (nums1[index1] > nums2[index2]) {
				nums1[index1+index2+1] = nums1[index1];
				index1--;
			}
			else {
				nums1[index1+index2+1] = nums2[index2];
				index2--;
			}
		}
		if (index1 < 0) {
			for (int i = 0; i <= index2; i++) {
				nums1[i] = nums2[i];
			}
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
