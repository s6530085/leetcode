package me.sunmin.algorithm;

//https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
//Runtime: 30 ms, faster than 30.26% of Java online submissions for Kth Smallest Element in a Sorted Matrix.
//todosm category:queue

public class P378_KthSmallestElementSortedMatrix {
	
	public int kthSmallest(int[][] matrix, int k) {
		int[] indexs = new int[matrix.length];
		indexs[0] = 1;
		int index = 1;
		int value = matrix[0][0];
		while (index < k) {
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for (int i = 0; i < indexs.length; i++) {
				int indexJ = indexs[i];
				if ((indexJ < matrix.length) && (matrix[i][indexJ] < min)) {
					min = matrix[i][indexJ];
					minIndex = i;
				}
			}
			value = min;
			indexs[minIndex]++;
			index++;
		}
		return value;
    }
	
}
