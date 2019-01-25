package me.sunmin.algorithm;
//https://leetcode.com/problems/median-of-two-sorted-arrays/
//Runtime: 28 ms, faster than 85.47% of Java online submissions for Median of Two Sorted Arrays.

public class P004_MedianOfTwoSortedArrays {
	private double getKth(int[] nums1, int m, int[] nums2, int n, int k) {
		if (m >= nums1.length) {
			return nums2[n+k-1];
		}
		if (n >= nums2.length) {
			return nums1[m+k-1];
		}
		if (k == 1) {
			return Math.min(nums1[m], nums2[n]);
		}
		
		int l = Math.min(k/2, nums1.length-m);
		int r = Math.min(k/2, nums2.length-n);
		if (nums1[m+l-1] < nums2[n+r-1]) {
			return getKth(nums1, m + l, nums2, n, k - l);
		}
		else {
			return getKth(nums1, m, nums2, n+r, k-r);
		}
	}
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int totalLength = nums1.length + nums2.length;
		int r = (totalLength + 2) / 2;
		if (totalLength % 2 == 1) {
			return getKth(nums1, 0, nums2, 0, r);
		}
		else {
			int l = (nums1.length + nums2.length + 1) / 2;
			return (getKth(nums1, 0, nums2, 0, l) + 
					getKth(nums1, 0, nums2, 0, r)) / 2.0;
		}
	}
}
