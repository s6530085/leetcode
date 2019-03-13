package me.sunmin.algorithm;
//https://leetcode.com/problems/perfect-number/
//Runtime: 522 ms, faster than 46.34% of Java online submissions for Perfect Number.

public class P507_PerfectNumber {
	public boolean checkPerfectNumber(int num) {
		int sum = 1;
		for (int i = 2; i <= (num >> 1); i++) {
			if (num%i==0) {
				sum += i;
				sum += num/i;
				if (sum > num) return false;
			}
		}
		return sum == num;
    }
}
