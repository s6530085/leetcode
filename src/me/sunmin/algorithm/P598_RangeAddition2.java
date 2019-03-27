package me.sunmin.algorithm;
//https://leetcode.com/problems/range-addition-ii/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Addition II.
//category:math

public class P598_RangeAddition2 {
	public int maxCount(int m, int n, int[][] ops) {
		if (ops == null || ops.length == 0) return m*n;
		int minI = Integer.MAX_VALUE;
		int minJ = Integer.MAX_VALUE;
		for (int[] is : ops) {
			if (is[0] < minI) {
				minI = is[0];
			}
			if (is[1] < minJ) {
				minJ = is[1];
			}
		}
		return minI * minJ;
    }
}
