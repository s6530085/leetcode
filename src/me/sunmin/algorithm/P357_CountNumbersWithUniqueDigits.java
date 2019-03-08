package me.sunmin.algorithm;
//https://leetcode.com/problems/count-numbers-with-unique-digits/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Numbers with Unique Digits.

public class P357_CountNumbersWithUniqueDigits {
	
	public int countNumbersWithUniqueDigits(int n) {
		if (n == 0) return 1;
		if (n == 1) return 10;
		if (n > 10) return 0;
        int c[] = new int[n+1];
        c[0] = 1;
        for (int i = 1; i <= n; i++) {
            int v = 9;
            for (int j = 0; j < i-1; j++) {
                v *= (9-j);
            }
            
        	c[i] = c[i-1] + v;
        }
        
        return c[n];
    }
}
