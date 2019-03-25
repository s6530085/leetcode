package me.sunmin.algorithm;
//https://leetcode.com/problems/minimum-falling-path-sum/
//Runtime: 5 ms, faster than 86.05% of Java online submissions for Minimum Falling Path Sum.
//category:dp

public class P931_MinimumFallingPathSum {
	
	public int minFallingPathSum(int[][] A) {
		int[][]m = new int[A.length][A.length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (i == 0) {
					m[i][j] = A[i][j];
					continue;
				}
				if (j == 0) {
					m[i][j] = Math.min(m[i-1][j], m[i-1][j+1]) + A[i][j];
				}
				else if (j != A.length - 1){
					m[i][j] = Math.min(m[i-1][j+1], Math.min(m[i-1][j-1], m[i-1][j])) + A[i][j];
				}
				else {
					m[i][j] = Math.min(m[i-1][j-1], m[i-1][j]) + A[i][j];
				}
			}
		}
		int min = m[A.length-1][0];
		for (int i = 1; i < m.length; i++) {
			if (m[m.length-1][i] < min) {
				min = m[m.length-1][i];
			}
		}
		return min;
    }
	

	
}
