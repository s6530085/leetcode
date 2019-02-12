package me.sunmin.algorithm;
//https://leetcode.com/problems/set-matrix-zeroes/
//Runtime: 1 ms, faster than 99.98% of Java online submissions for Set Matrix Zeroes.

public class P073_SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
		int hz[] = new int[matrix.length];
		int vz[] = new int[matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					hz[i] = 1;
					vz[j] = 1;
				}
			}
		}
		for (int i = 0; i < hz.length; i++) {
			if (hz[i] == 1) {
				for (int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < vz.length; i++) {
			if (vz[i] == 1) {
				for (int j = 0; j < matrix.length; j++) {
					matrix[j][i] = 0;
				}
			}
		}
    }
	
	public static void main(String[] args) {
		P073_SetMatrixZeroes z = new P073_SetMatrixZeroes();
		int[][] matrix = {{1,1,1}, {1,0,1}, {1,1,1}};
		z.setZeroes(matrix);
	}
}
