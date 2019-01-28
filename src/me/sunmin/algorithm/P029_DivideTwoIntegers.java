package me.sunmin.algorithm;
//https://leetcode.com/problems/divide-two-integers/
//Runtime: 5863 ms, faster than 2.56% of Java online submissions for Divide Two Integers.
// todosm

public class P029_DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
        if (dividend == 0)	return 0;
		if (dividend == Integer.MIN_VALUE && divisor == -1)	return Integer.MAX_VALUE;
		int dd = Math.abs(dividend);
		int ds = Math.abs(divisor);
		int di = 0;
		while (dd - ds >= 0) {
			dd -= ds;
			di++;
		}
		if (dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0) {
			return di;
		}
		else {
			return -di;
		}

    }
}
