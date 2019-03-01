package me.sunmin.algorithm;
//https://leetcode.com/problems/bitwise-and-of-numbers-range/
//Runtime: 4 ms, faster than 100.00% of Java online submissions for Bitwise AND of Numbers Range.


public class P201_BitwiseANDNumbersRange {

	public int rangeBitwiseAnd(int m, int n) {
		if (m == 0) return 0;
		if (m == n) return m;
		int minbit = 30;
		int maxbit = 30;
		while(minbit >= 0) {
			if ((m >> minbit & 1) == 1) {
				break;
			}
			minbit--;
		}
		
		
		while(maxbit >= 0) {
			if ((n >> maxbit & 1) == 1) {
				break;
			}
			maxbit--;
		}
		
		if (maxbit > minbit) {
			return 0;
		}
		else {
			for (int i = minbit - 1; i >= 0; i--) {
				if (n >> i != m >> i) {
					return (n>>(i+1))<<(i+1);
				}
			}
		}
		return 0;
    }
	
	
	public static void main(String[] args) {
		P201_BitwiseANDNumbersRange r = new P201_BitwiseANDNumbersRange();
		int i = r.rangeBitwiseAnd(20, 21);
	}

}
