package me.sunmin.algorithm;
//https://leetcode.com/problems/complement-of-base-10-integer/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Complement of Base 10 Integer.
//category:bit
public class P1012_ComplementBase10Integer {
	public int bitwiseComplement(int N) {
		if (N == 0) return 1;
        int digit = 0;
        int temp = N;
        while (temp > 0) {
        	digit++;
        	temp >>= 1;
        }
        return ((1 << digit) - 1) ^ N;
    }
	
	public static void main(String[] args) {
		P1012_ComplementBase10Integer c = new P1012_ComplementBase10Integer();
		int i = c.bitwiseComplement(5);
	}
}
