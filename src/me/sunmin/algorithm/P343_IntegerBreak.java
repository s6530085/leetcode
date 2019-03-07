package me.sunmin.algorithm;
//https://leetcode.com/problems/integer-break/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Integer Break.
// todosm
public class P343_IntegerBreak {
	static int[] breaks = null;
	
	public int integerBreak(int n) {
		if (breaks == null) {
			breaks = new int[59];
			breaks[0] = 0;
			breaks[1] = 1;
			for (int i = 2; i < breaks.length; i++) {
				int max = 1;
				for (int j = 1; j < i; j++) {
					max = Math.max(max, Math.max(j,breaks[j]) * (i-j));
				}
				breaks[i] = max;
			}
		}
		
		return breaks[n];
    }
	
	public static void main(String[] args) {
		P343_IntegerBreak b = new P343_IntegerBreak();
		int i = b.integerBreak(12);
	}
}
