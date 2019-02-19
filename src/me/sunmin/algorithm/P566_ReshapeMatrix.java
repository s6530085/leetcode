package me.sunmin.algorithm;

import java.util.Arrays;

//https://leetcode.com/problems/reshape-the-matrix/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Reshape the Matrix.

public class P566_ReshapeMatrix {

	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if (nums.length * nums[0].length != r * c) return nums;
		int[][] result = new int[r][c];
		for (int i = 0; i < r*c; i++) {
			result[i/c][i%c] = nums[i/nums[0].length][i%nums[0].length];
		}
		
		return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
