package me.sunmin.algorithm;
//https://leetcode.com/problems/toeplitz-matrix/
//Runtime: 20 ms, faster than 95.26% of Java online submissions for Toeplitz Matrix.

public class P766_ToeplitzMatrix {
	private boolean isLineToeplitz(int beginI, int beginJ, int[][]matrix) {
		int init = matrix[beginI][beginJ];
		while((++beginI < matrix.length) && (++beginJ < matrix[0].length)) {
			if (matrix[beginI][beginJ] != init) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isToeplitzMatrix(int[][] matrix) {
		int rowCount= matrix.length;
		int columnCount = matrix[0].length;
		int beginI = rowCount-1;
		int beginJ = 0;
		for (int index = 0; index < rowCount+columnCount-1; index++) {
			if (!isLineToeplitz(beginI, beginJ, matrix)) {
				return false;
			}
			if (beginJ == 0) {
				if (beginI != 0) {
					beginI--;
				}else {
					beginJ++;
				}
			}
			else {
				beginJ++;
			}
		}
		
		return true;
	}

}
