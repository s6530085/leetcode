package me.sunmin.algorithm;
//https://leetcode.com/problems/arithmetic-slices/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Arithmetic Slices.

public class P413_ArithmeticSlices {
	public int numberOfArithmeticSlices(int[] A) {
		if (A.length <= 2) return 0;
		int num = 0;
		int begin = 0;
		for (int i = 1; i < A.length-1; i++) {
			if (A[i] - A[i-1] != A[i+1] - A[i]) {
				if (i - begin >= 2) {
					int length = i - begin + 1;
					for (int j = 3; j <= length; j++) {
						num += length - j + 1;
					}
				}
				begin = i;
			}
		}
		if (A.length-1-begin >= 2) {
			int length = A.length-1 - begin + 1;
			for (int j = 3; j <= length; j++) {
				num += length - j + 1;
			}
		}
		
		return num;
    }
	
	public static void main(String[] args) {
		P413_ArithmeticSlices a = new P413_ArithmeticSlices();
		int i = a.numberOfArithmeticSlices(new int[] {1,2,3,4,6});
	}
}
