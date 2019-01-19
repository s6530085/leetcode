package me.sunmin.algorithm;
//https://leetcode.com/problems/flipping-an-image/
//Runtime: 8 ms, faster than 18.25% of Java online submissions for Flipping an Image.
//todosm
public class P832_FlippingAnImage {
	public int[][] flipAndInvertImage(int[][] A) {
        int hLength = A[0].length;
		int vLength = A.length;
		for (int i = 0; i < vLength; i++) {
			for (int j = 0; j < hLength/2; j++) {
				int x = A[i][j];
				int y = A[i][hLength-j-1];
				int temp = x;
				x = y;
				y = temp;
				A[i][j] = x ^ 1;
				A[i][hLength-j-1] = y ^ 1;
			}
			if (hLength%2==1) {
				A[i][hLength/2] = A[i][hLength/2] ^ 1; 
			}
		}
		return A;

    }
}
