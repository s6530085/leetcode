package me.sunmin.algorithm;
//https://leetcode.com/problems/add-digits/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Digits.

public class P258_AddDigits {
	public int addDigits(int num) {
		while (num >= 10) {
			int i = 0;
			while (num > 0) {
				i += num%10;
				num /= 10;
			}
			num = i;
		}
		
		return num;
    }
	
	public static void main(String[] args) {
		P258_AddDigits d = new P258_AddDigits();
		int i = d.addDigits(38);
	}
}
