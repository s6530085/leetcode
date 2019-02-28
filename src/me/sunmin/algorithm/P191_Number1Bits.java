package me.sunmin.algorithm;
//https://leetcode.com/problems/number-of-1-bits/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of 1 Bits.


public class P191_Number1Bits {
	public int hammingWeight(int n) {
		int weight = 0;
		for (int i = 0; i < 32; i++) {
			if ((n >>> i & 1) == 1) {
				weight++;
			}
		}
		
		return weight;
    }
}
