package me.sunmin.algorithm;
//https://leetcode.com/problems/binary-number-with-alternating-bits/
//Runtime: 6 ms, faster than 96.20% of Java online submissions for Binary Number with Alternating Bits.

public class P693_BinaryNumberWithAlternatingBits {

	public boolean hasAlternatingBits(int n) {
		boolean lastZero = ((n&1)==0);
		n>>=1;
		while(n>0) {
			boolean b = ((n&1)==0);
			if (b == lastZero) {
				return false;
			}
			else {
				lastZero = !lastZero;
			}
			n >>= 1;
		}
		return true;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P693_BinaryNumberWithAlternatingBits a = new P693_BinaryNumberWithAlternatingBits();
		boolean b = a.hasAlternatingBits(5);
		b = a.hasAlternatingBits(7);
		b = a.hasAlternatingBits(11);
		b = a.hasAlternatingBits(10);
	}

}
