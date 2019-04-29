package me.sunmin.algorithm;
//https://leetcode.com/problems/score-after-flipping-matrix/
//Runtime: 1 ms, faster than 79.94% of Java online submissions for Score After Flipping Matrix.

public class P861_ScoreAfterFlippingMatrix {
	
	public int matrixScore(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			if (A[i][0] == 0) {
				for (int j = 0; j < A[0].length; j++) {
					A[i][j] = (A[i][j] == 0 ? 1 : 0);
				}
			}
		}
		for (int j = 0; j < A[0].length; j++) {
			int zeroes = 0;
			for (int i = 0; i < A.length; i++) {
				if (A[i][j] == 0) zeroes++;
			}
			if (zeroes > A.length/2) {
				for (int i = 0; i < A.length; i++) {
					A[i][j] = (A[i][j] == 0 ? 1 : 0);
				}
			}
		}
		
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			int pow = 1;
			for (int j = A[0].length - 1; j >=0; j--) {
				if (j != A[0].length - 1) pow *= 2;
				if (A[i][j] == 1) {
					sum += pow;
				}
			}
		}
		
		return sum;
		
		
    }
	
	public static void main(String[] args) {
		P861_ScoreAfterFlippingMatrix m = new P861_ScoreAfterFlippingMatrix();
		int i = m.matrixScore(new int[][] {{0,0,1,1},{1,0,1,0},{1,1,0,0}});
	}
}
