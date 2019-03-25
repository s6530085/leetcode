package me.sunmin.algorithm;
//https://leetcode.com/problems/sum-of-even-numbers-after-queries/
//Runtime: 5 ms, faster than 100.00% of Java online submissions for Sum of Even Numbers After Queries.

public class P985_SumEvenNumbersAfterQueries {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int[] r = new int[queries.length];
		int index = 0;
		int es = 0;
		for (int[] q : queries) {
			if (index == 0) {
				A[q[1]] += q[0];
				for (int i : A) {
					if ((i & 1) == 0) {
						es += i;
					}
				}
			}
			else {
				int v = A[q[1]] + q[0];
				if ((A[q[1]] & 1) == 1) {
					if ((v & 1) != 1) {
						es += v;
					}
				}
				else {
					if ((v & 1) == 0) {
						es += q[0];
					}
					else {
						es -= A[q[1]];
					}
				}
				A[q[1]] += q[0];
			}
			
			r[index++] = es;
		}
		
		return r;
    }
}
