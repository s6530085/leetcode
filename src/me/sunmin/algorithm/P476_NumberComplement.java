package me.sunmin.algorithm;
//https://leetcode.com/problems/number-complement/
//Runtime: 8 ms, faster than 94.55% of Java online submissions for Number Complement.

public class P476_NumberComplement {
	public int findComplement(int num) {
        if (num == Integer.MAX_VALUE) return 0;
		int index = 0;
		while (num >= (int)Math.pow(2, index)) {
			index++;
		}
		return (int)Math.pow(2, index-1) +((int)Math.pow(2, index-1) - 1) - num;
    }
}
