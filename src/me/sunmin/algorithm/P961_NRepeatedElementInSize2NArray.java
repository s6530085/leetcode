package me.sunmin.algorithm;
//https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
//Runtime: 9 ms, faster than 70.91% of Java online submissions for N-Repeated Element in Size 2N Array.

public class P961_NRepeatedElementInSize2NArray {
	public int repeatedNTimes(int[] A) {
        int array[] = new int[10000];
		for (int i = 0; i < A.length; i++) {
			if (array[A[i]] != 0) {
				return A[i];
			}
			else {
				array[A[i]] = 1;
			}
		}
		return -1;

    }
}
