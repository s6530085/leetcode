package me.sunmin.algorithm;
//https://leetcode.com/problems/sort-array-by-parity-ii/
//Runtime: 8 ms, faster than 95.94% of Java online submissions for Sort Array By Parity II.

public class P922_SortArrayByParityII {
	public int[] sortArrayByParityII(int[] A) {
        int evenIndex = 0;
		int oddIndex = 1;
		int[] result = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			int j = A[i];
			if (j%2==0) {
				result[evenIndex] = j;
				evenIndex += 2;
			}
			else {
				result[oddIndex] = j;
				oddIndex += 2;
			}
		}
		return result;

    }
}
