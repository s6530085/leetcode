package me.sunmin.algorithm;
//https://leetcode.com/problems/ugly-number/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Ugly Number.

public class P263_UglyNumber {
	public boolean isUgly(int num) {
		if (num <= 0) return false;
		if (num <= 3) return true;

		while ((num & 1) == 1) {
			num >>= 1;
		}
		while(num % 3 == 0) {
			num /= 3;
		}
		while(num % 5 == 0) {
			num /= 5;
		}
		return num == 1;
    }
}
