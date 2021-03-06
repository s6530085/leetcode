//https://leetcode.com/problems/reverse-integer/
//Given a 32-bit signed integer, reverse digits of an integer.
//Runtime: 15 ms, faster than 99.78% of Java online submissions for Reverse Integer.

package me.sunmin.algorithm;

public class P007_ReverseInteger {
	
	static public int reverse(int x) {
        if (x == Integer.MIN_VALUE || x == 0) {
        	return 0;
        }
        
        boolean negative = x < 0;
        x = Math.abs(x);
        int digit = 0;
        int[] digits = new int[10];
        while(x > 0) {
        	digits[digit++] = x%10;
        	x /= 10;
        }
        long s = 0;
        for (int i = digit - 1; i >= 0; i--) {
        	long zero = 1;
        	for (int j = 1; j <= digit-1-i; j++) {
        		zero *= 10;
        	}
        	s += digits[i] * zero;
//        	s += digits[i] * Math.pow(10, digit-1-i);
        }
        if (s > Integer.MAX_VALUE) {
        	return 0;
        }
        return negative ? -(int)s : (int)s;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = P007_ReverseInteger.reverse(1534236469);
		i = P007_ReverseInteger.reverse(321);
		i = P007_ReverseInteger.reverse(-123);
		i = P007_ReverseInteger.reverse(120);
		i = P007_ReverseInteger.reverse(0);
	}

}
