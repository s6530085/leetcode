package me.sunmin.algorithm;
//https://leetcode.com/problems/power-of-three/
//Runtime: 10 ms, faster than 99.86% of Java online submissions for Power of Three.

public class P326_PowerThree {
	public boolean isPowerOfThree(int n) {
		if (n <= 0)	return false;
		while (n > 1) {
			if (n%3 != 0) return false;
			n /= 3;
		}
		return true;
    }
}
