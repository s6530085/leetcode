package me.sunmin.algorithm;
//https://leetcode.com/problems/reverse-bits/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Bits.


public class P190_ReverseBits {

	public int reverseBits(int n) {
		int r = 0;
		for (int i = 0; i < 32; i++) {
			if ((n >>> i & 1) == 1) {
				r += 1 << (31 - i);
			}
		}
		return r;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
