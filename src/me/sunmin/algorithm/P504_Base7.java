package me.sunmin.algorithm;
//https://leetcode.com/problems/base-7/
//Runtime: 6 ms, faster than 99.31% of Java online submissions for Base 7.

public class P504_Base7 {
	public String convertToBase7(int num) {
		if (num == 0) return "0";
		boolean ne = num < 0;
		num = Math.abs(num);
		StringBuilder sb = new StringBuilder();
		while (num > 0) {
			sb.insert(0, num%7);
			num /= 7;
		}
		if (ne) sb.insert(0, '-');
		return sb.toString();
    }
}
