package me.sunmin.algorithm;
//https://leetcode.com/problems/range-sum-query-2d-immutable/
//Runtime: 57 ms, faster than 99.90% of Java online submissions for Range Sum Query 2D - Immutable.

public class P304_RangeSumQuery2D {
	
	private int matrix[][];
	public P304_RangeSumQuery2D(int[][] matrix) {
		this.matrix = matrix;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == 0 && j == 0) {
					
				}
				else if (i == 0 && j > 0) {
					matrix[i][j] += matrix[i][j-1];
				}
				else if (j == 0 && i > 0) {
					matrix[i][j] += matrix[i-1][j];
				}
				else {
					matrix[i][j] += matrix[i-1][j] + matrix[i][j-1] - matrix[i-1][j-1];
				}
			}
		}
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int top = row1 > 0 ? matrix[row1-1][col2] : 0;
        int left = col1 > 0 ? matrix[row2][col1-1] : 0;
        int left_top = (row1 > 0 && col1 > 0) ? matrix[row1-1][col1-1] : 0;
        
        return matrix[row2][col2] - top - left + left_top;
    }
}
