package me.sunmin.algorithm;

import java.util.Arrays;

//https://leetcode.com/problems/largest-perimeter-triangle/
//Runtime: 14 ms, faster than 98.92% of Java online submissions for Largest Perimeter Triangle.

public class P976_LargestPerimeterTriangle {
	public int largestPerimeter(int[] A) {
		Arrays.sort(A);
		for (int i = A.length-1; i >= 2; i--) {
			if (A[i] < A[i-1] + A[i-2]) {
				return A[i] + A[i-1] + A[i-2];
			}
		}
		
		return 0;
    }
}
