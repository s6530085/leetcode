package me.sunmin.algorithm;
//https://leetcode.com/problems/spiral-matrix-ii/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Spiral Matrix II.

public class P059_SpiralMatrix2 {

	private void p(int[][]nums, int n, int circle, int begin) {
		if (circle < (n+1)/2) {
			int add = 0;
			for (int i = circle; i < n - circle; i++) {
				nums[circle][i] = begin + add++; 
			}
			for (int i = circle+1; i < n - circle - 1; i++) {
				nums[i][n-circle-1] = begin + add++;
			}
			for (int i = n - circle - 1; i >= circle; i--) {
                if (n-circle-1 > circle) {
					nums[n-circle-1][i] = begin + add++;
				}			}
			for (int i = n - circle - 2; i > circle; i--) {
				nums[i][circle] = begin + add++;
			}
			p(nums, n, circle+1, begin + 4 * (n - 2*circle) - 4);
		}
	}
	
	public int[][] generateMatrix(int n) {
		int[][] r = new int[n][n];
		p(r, n, 0, 1);
		return r;
    }
}
