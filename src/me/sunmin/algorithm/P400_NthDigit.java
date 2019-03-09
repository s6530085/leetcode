package me.sunmin.algorithm;
//https://leetcode.com/problems/nth-digit/
//Runtime: 2 ms, faster than 100.00% of Java online submissions for Nth Digit.

public class P400_NthDigit {
	public int findNthDigit(int n) {
		int base = 9;
		int po = 0;
		while (n > base * Math.pow(10, po) * (po+1)) {
			n -= base * (int)Math.pow(10, po) * (po+1);
			po++;
		}
		n--;
		int i = n / (po+1);
		int j = n % (po+1);
		int target = (int)Math.pow(10, po) + i;
		while(j < po) {
			target /=  10;
			j++;
		}
		return target%10;
    }
	
	public static void main(String[] args) {
		P400_NthDigit n = new P400_NthDigit();
		int i = n.findNthDigit(1000);
		
	}
}
