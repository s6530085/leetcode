package me.sunmin.algorithm;
//https://leetcode.com/problems/image-smoother/
//Runtime: 11 ms, faster than 94.17% of Java online submissions for Image Smoother.

public class P661_ImageSmoother {
	public int[][] imageSmoother(int[][] M) {
		int[][] r = new int[M.length][M[0].length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				int sum = M[i][j];
				int count = 1;
				if (i > 0 && j > 0) {
					sum += M[i-1][j-1];
					count++;
				}
				if (i > 0) {
					sum += M[i-1][j];
					count++;
				}
				if (i > 0 && j < M[0].length - 1) {
					sum += M[i-1][j+1];
					count++;
				}
				if (j > 0) {
					sum += M[i][j-1];
					count++;
				}
				if (j < M[0].length - 1) {
					sum += M[i][j+1];
					count++;
				}
				if (i < M.length - 1 && j > 0) {
					sum += M[i+1][j-1];
					count++;
				}
				if (i < M.length - 1) {
					sum += M[i+1][j];
					count++;
				}
				if (i < M.length - 1 && j < M[0].length - 1) {
					sum += M[i+1][j+1];
					count++;
				}
				r[i][j] = sum/count;
			}
		}
		return r;
    }
}
