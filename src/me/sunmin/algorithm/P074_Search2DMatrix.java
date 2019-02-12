package me.sunmin.algorithm;
//https://leetcode.com/problems/search-a-2d-matrix/
//Runtime: 4 ms, faster than 100.00% of Java online submissions for Search a 2D Matrix.

public class P074_Search2DMatrix {

	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0) return false;
		int size = matrix[0].length;
        int lo = 0;
        int hi = matrix.length * matrix[0].length - 1;
        while (lo <= hi) {
        	int middle = lo + ((hi - lo) >> 1);
        	int middleValue = matrix[middle/size][middle%size];
        	if (middleValue == target) {
        		return true;
        	}
        	else if (middleValue > target) {
        		hi = middle - 1;
        	}
        	else {
        		lo = middle + 1;
        	}
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
