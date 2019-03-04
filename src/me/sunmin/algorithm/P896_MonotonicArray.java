package me.sunmin.algorithm;
//https://leetcode.com/problems/monotonic-array/
//Runtime: 10 ms, faster than 100.00% of Java online submissions for Monotonic Array.


public class P896_MonotonicArray {

	public boolean isMonotonic(int[] A) {
		if (A.length < 2) return true;
		int firstComp = 0;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] > A[i+1]) {
				if (firstComp == 0) {
					firstComp = 1;
				}
				else {
					if (firstComp == -1) return false;
				}
			}
			else if (A[i] < A[i+1]) {
				if (firstComp == 0) {
					firstComp = -1;
				}
				else {
					if (firstComp == 1) return false;
				}
			}
		}
		return true;
    }
	
	public static void main(String[]args) {
		P896_MonotonicArray a = new P896_MonotonicArray();
		boolean b = a.isMonotonic(new int[] {6,5,4,4});
	}
}
