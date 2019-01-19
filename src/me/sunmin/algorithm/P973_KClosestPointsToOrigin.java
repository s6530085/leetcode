package me.sunmin.algorithm;
//https://leetcode.com/problems/k-closest-points-to-origin/
//Runtime: 56 ms, faster than 78.81% of Java online submissions for K Closest Points to Origin.

import java.util.Arrays;
import java.util.Comparator;

public class P973_KClosestPointsToOrigin {
	
	public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				int[]p1 = (int[])o1;
				int[]p2 = (int[])o2;
				int d1 = p1[0]*p1[0] + p1[1]*p1[1];
				int d2 = p2[0]*p2[0] + p2[1]*p2[1];
				if (d1 < d2) {
					return -1;
				}
				else if (d1 == d2) {
					return 0;
				}
				else {
					return 1;
				}
			}});
		int [][] result = new int[K][];
		for (int i = 0; i < K; i++) {
			result[i] = points[i];
		}
		return result;

    }
}
