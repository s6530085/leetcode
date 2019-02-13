package me.sunmin.algorithm;
//https://leetcode.com/problems/squares-of-a-sorted-array/
//Runtime: 7 ms, faster than 95.35% of Java online submissions for Squares of a Sorted Array.

public class P977_SquaresOfSortedArray {
	
	public int[] sortedSquares(int[] A) {
		int[] r = new int[A.length];
		int lo = 0;
		int hi = A.length - 1;
		int index = hi;
		while (index >= 0) {
			int lov = Math.abs(A[lo]);
			int hiv = Math.abs(A[hi]);
			if (lov > hiv) {
				r[index] = lov * lov;
				lo++;
			}
			else {
				r[index] = hiv * hiv;
				hi--;
			}
			index--;
		}
		return r;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P977_SquaresOfSortedArray s = new P977_SquaresOfSortedArray();
		int i[] = s.sortedSquares(new int[] {-7,-3,2,3,11});
	}

}
