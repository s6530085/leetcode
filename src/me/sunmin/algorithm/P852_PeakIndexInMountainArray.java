package me.sunmin.algorithm;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//Runtime: 3 ms, faster than 88.98% of Java online submissions for Peak Index in a Mountain Array.

public class P852_PeakIndexInMountainArray {
	public int peakIndexInMountainArray(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
        	if (A[i] > A[i+1]) {
        		return i;
        	}
        }
        return -1;
    }
}
