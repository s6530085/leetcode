package me.sunmin.algorithm;
//https://leetcode.com/problems/add-binary/
//Runtime: 2 ms, faster than 96.12% of Java online submissions for Add Binary.

public class P067_AddBinary {
	public String addBinary(String a, String b) {
		String r = "";
		char[] as = a.toCharArray();
		char[] bs = b.toCharArray();
		boolean carry = false;
		int maxLength = Math.max(as.length, bs.length);
		for (int i = 0; i < maxLength; i++) {
			int ac = 0;
			int bc = 0;
			if (i < as.length) {
				ac = as[as.length - i - 1] - '0';
			}
			if (i < bs.length) {
				bc = bs[bs.length - i - 1] - '0';
			}
			int v = ac + bc + (carry ? 1 : 0);
			if (v >= 2) {
				carry = true;
			}
			else {
				carry = false;
			}
			v %= 2;
			if (v == 0) {
				r = "0" + r;
			}
			else {
				r = "1" + r;
			}
		}
		if (carry) {
			r = "1" + r;
		}
		return r;
    }
	
	public static void main(String[] args) {
		P067_AddBinary b = new P067_AddBinary();
		System.out.println(b.addBinary("1010", "1011"));
	}
}
