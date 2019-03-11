package me.sunmin.algorithm;
//https://leetcode.com/problems/convert-a-number-to-hexadecimal/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Convert a Number to Hexadecimal.

public class P405_ConvertNumberHexadecimal {
	
	public String toHex(int num) {
		char digits[] = "0123456789abcdef".toCharArray();
		if (num == 0) return "";
		String digit = "";
		while (num != 0) {
			digit = digits[num&0xf] + digit;
			num >>>= 4;
		}
		return digit;
    }
	
	public static void main(String[] args) {
		P405_ConvertNumberHexadecimal h = new P405_ConvertNumberHexadecimal();
		String s = h.toHex(26);
		s = h.toHex(-1);
	}
	
}
