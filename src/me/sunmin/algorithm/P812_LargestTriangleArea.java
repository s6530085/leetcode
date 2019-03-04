package me.sunmin.algorithm;
//https://leetcode.com/problems/largest-triangle-area/
//Runtime: 4 ms, faster than 100.00% of Java online submissions for Largest Triangle Area.

public class P812_LargestTriangleArea {
	
//	private double area(int []p1, int[]p2, int[]p3) {
//		double line1 = Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
//		double line2 = Math.sqrt(Math.pow(p3[0] - p2[0], 2) + Math.pow(p3[1] - p2[1], 2));
//		double line3 = Math.sqrt(Math.pow(p1[0] - p3[0], 2) + Math.pow(p1[1] - p3[1], 2));
//		if (line1 + line2 > line3 && line2 + line3 > line1 && line1 + line3 > line2) {
//			double p = (line1 + line2 + line3) / 2;
//			return Math.sqrt(p * (p - line1) * (p - line2) * (p - line3));
//		}
//		else {
//			return 0;
//		}
//	}
	
	public double area(int[] P, int[] Q, int[] R) {
        return 0.5 * Math.abs(P[0]*Q[1] + Q[0]*R[1] + R[0]*P[1]
                             -P[1]*Q[0] - Q[1]*R[0] - R[1]*P[0]);
    }
	
	public double largestTriangleArea(int[][] points) {
		double max = 0;
		for (int i = 0; i < points.length - 2; i++) {
			for (int j = i+1; j < points.length - 1; j++) {
				for (int k = j+1; k < points.length; k++) {
					double a = area(points[i], points[j], points[k]);
					if (a > max) {
						max = a;
					}
				}
			}
		}
		return max;
    }
}
