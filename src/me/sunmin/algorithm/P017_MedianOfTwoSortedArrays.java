//https://leetcode.com/problems/median-of-two-sorted-arrays/
//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//
//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//
//You may assume nums1 and nums2 cannot be both empty.
//Runtime: 3 ms, faster than 90.63% of Java online submissions for Container With Most Water.

package me.sunmin.algorithm;

public class P017_MedianOfTwoSortedArrays {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int length = nums1.length + nums2.length;
		boolean isOdd = (length % 2 == 1);
		
		int index1 = 0;
		int index2 = 0;
		
		double median = 0;

		return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1, 3};
		int[] nums2 = {2};
		double d = P017_MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
		
		int[] nums3 = {1, 2};
		int[] nums4 = {3,4};
		d = P017_MedianOfTwoSortedArrays.findMedianSortedArrays(nums3, nums4);
	}

}
