package me.sunmin.algorithm;
//https://leetcode.com/problems/smallest-range-i/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Smallest Range I.

public class P908_SmallestRange {
	public int smallestRangeI(int[] A, int K) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i : A) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}
		return (max - min - 2*K) > 0 ? (max - min - 2*K): 0;
    }
}
