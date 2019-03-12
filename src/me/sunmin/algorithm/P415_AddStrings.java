package me.sunmin.algorithm;
//https://leetcode.com/problems/add-strings/
//Runtime: 11 ms, faster than 82.07% of Java online submissions for Add Strings.

public class P415_AddStrings {
	public String addStrings(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		boolean carry = false;
		int l = Math.min(num1.length(), num2.length());
		for (int i = 0; i < l; i++) {
			int i1 = num1.charAt(num1.length() - i - 1) - '0';
			int i2 = num2.charAt(num2.length() - i - 1) - '0';
			int v = i1 + i2 + (carry ? 1 : 0);
			sb.insert(0, v%10);
			carry = (v >= 10);
		}
		String num = num1.length() > num2.length() ? num1 : num2;
		for (int i = num.length() - l - 1; i >= 0; i--) {
			if (carry) {
				int vi = num.charAt(i) - '0' + (carry ? 1 : 0);
				sb.insert(0, vi%10);
				carry = (vi >= 10);
			}
			else {
				sb.insert(0, num.toCharArray(), 0, i+1);
				break;
			}
		}
		if (carry) {
			sb.insert(0, 1);
		}
		
		return sb.toString();
    }
	
	public static void main(String[] args) {
		P415_AddStrings a = new P415_AddStrings();
		String s  = a.addStrings("123", "0");
	}
}
