package me.sunmin.algorithm;
//https://leetcode.com/problems/valid-perfect-square/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Valid Perfect Square.

public class P367_ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
		long lo = 1;
		long hi = (num+1)/2;
		while (lo <= hi) {
			long mid = lo + (hi - lo) / 2;
			long v = mid * mid;
			if (v == num) {
				return true;
			}
			else if (v < num) {
				lo = mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		return false;
    }
	
	
	public static void main(String[] args) {
		P367_ValidPerfectSquare v = new P367_ValidPerfectSquare();
		boolean b = v.isPerfectSquare(1);
		b = v.isPerfectSquare(4);
		b = v.isPerfectSquare(16);
		b = v.isPerfectSquare(144);
		b = v.isPerfectSquare(808201);
	}
}
