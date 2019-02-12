package me.sunmin.algorithm;
//https://leetcode.com/problems/plus-one/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.

public class P066_PlusOne {
	public int[] plusOne(int[] digits) {
		boolean allNine = true;
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] != 9) {
				allNine = false;
				break;
			}
		}
		if (allNine) {
			int[] r= new int[digits.length+1];
			r[0] = 1;
			return r;
		}
		else {
			boolean carry = false;
			for (int i = digits.length-1; i >= 0; i--) {
				int v = digits[i] + (i == digits.length-1 ? 1 : 0) + (carry ? 1 : 0);
				if (v >= 10) {
					digits[i] = 0;
					carry = true;
				}
				else {
					break;
				}
			}
			return digits;
		}
    }
}
