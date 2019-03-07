package me.sunmin.algorithm;
//https://leetcode.com/problems/power-of-four/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Power of Four.

public class P342_PowerOfFour {
	public boolean isPowerOfFour(int num) {
		if (num <= 0) return false;
		while (num != 1) {
			if ((num & 3) == 0) {
				num >>= 2;
			}
			else {
				return false;
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		P342_PowerOfFour p = new P342_PowerOfFour();
		boolean b = p.isPowerOfFour(4);
		b = p.isPowerOfFour(5);
		b = p.isPowerOfFour(16);
		b = p.isPowerOfFour(17);
		b = p.isPowerOfFour(Integer.MAX_VALUE);
		
	}
}
