package me.sunmin.algorithm;
//https://leetcode.com/problems/rotate-image/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Rotate Image.


public class P048_RotateImage {
	private void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
		int temp = matrix[i1][j1];
		matrix[i1][j1] = matrix[i2][j2];
		matrix[i2][j2] = temp;
	}
	
	public void rotateCircle(int[][] matrix, int circle) {
		if (circle < matrix.length/2) {
			int border = matrix.length - circle - 1;
			for (int i = circle; i < border; i++) {
				swap(matrix, circle, i, i, border);
				swap(matrix, circle, i, border, border-i+circle);
				swap(matrix, circle, i, border-i+circle, circle);
			}
			rotateCircle(matrix, circle+1);
		}
	}
	
	public void rotate(int[][] matrix) {
        rotateCircle(matrix, 0);
    }
}
