package me.sunmin.algorithm;
//https://leetcode.com/problems/power-of-two/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Power of Two.
// category:bit

public class P231_PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		return (n > 0) && ((n & n-1)==0);
    }
}
