package me.sunmin.algorithm;
//https://leetcode.com/problems/transpose-matrix/
//Runtime: 5 ms, faster than 18.39% of Java online submissions for Transpose Matrix.
// todosm

public class P867_TransposeMatrix {
	public int[][] transpose(int[][] A) {
        int[][] B = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                B[j][i] = A[i][j];
            }
        }
        return B;
    }
}
