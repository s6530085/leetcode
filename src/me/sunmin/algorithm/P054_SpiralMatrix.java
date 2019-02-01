package me.sunmin.algorithm;
//https://leetcode.com/problems/spiral-matrix/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Spiral Matrix.

import java.util.ArrayList;
import java.util.List;


public class P054_SpiralMatrix {

	private void p(int[][] matrix, int circle, List<Integer> l) {
		if (circle < Math.min(matrix.length+1, matrix[0].length+1)/2) {
			for (int index = circle; index < matrix[0].length - circle; index++) {
				l.add(matrix[circle][index]);
			}
			for (int index = circle + 1; index < matrix.length - circle - 1; index++) {
				l.add(matrix[index][matrix[0].length-circle-1]);
			}
			for (int index = matrix[0].length - circle - 1; index >= circle; index--) {
				if (matrix.length-circle-1 > circle) {
					l.add(matrix[matrix.length-circle-1][index]);
				}
			}
			for (int index = matrix.length - circle - 2; index > circle; index--) {
				if (circle < matrix[0].length-circle-1) {
					l.add(matrix[index][circle]);
				}
			}
			p(matrix, circle+1, l);
		}
	}
	
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> list = new ArrayList<Integer>();
        if (matrix.length > 0) p(matrix, 0, list);
    	return list;
    }

}
