package me.sunmin.algorithm;
//https://leetcode.com/problems/sum-of-square-numbers/
//Runtime: 44 ms, faster than 26.08% of Java online submissions for Sum of Square Numbers.
//category:math

public class P633_SumSquareNumbers {

	private static boolean bs(long n) {
		long lo = 0;
		long hi = n;
		while (lo <= hi) {
			long mid = lo + (hi - lo) / 2;
			long midv = mid*mid;
			if (midv == n) return true;
			else if (midv > n) hi = mid-1;
			else lo = mid+1;
		}
		return false;
	}
	
	public boolean judgeSquareSum(int c) {
		for (int i = 0;; i++) {
			int pi = i*i;
			if (pi > 0 && c >= pi) {
				if(bs(c-pi)) return true;
			}
			else {
				break;
			}
		}
		return false;
    }
	
	public static void main(String[] args) {
		P633_SumSquareNumbers n = new P633_SumSquareNumbers();
		n.judgeSquareSum(Integer.MAX_VALUE);
		
	}
}
