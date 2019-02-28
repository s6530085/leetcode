package me.sunmin.algorithm;
//https://leetcode.com/problems/factorial-trailing-zeroes/
//Runtime: 9 ms, faster than 100.00% of Java online submissions for Factorial Trailing Zeroes.


public class P172_FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
		int count = 0;
		int p = 1;
		while(true) {
			int po = (int) Math.pow(5, p);
			if (n <= po) {
				count += n/po;
			}
			else {
				break;
			}
		}
		return count;
   }
}
