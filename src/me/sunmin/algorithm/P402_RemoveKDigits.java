package me.sunmin.algorithm;
//https://leetcode.com/problems/remove-k-digits/
//Runtime: 5 ms, faster than 87.66% of Java online submissions for Remove K Digits.

public class P402_RemoveKDigits {
	
	public String removeKdigits(String num, int k) {
		StringBuilder sb = new StringBuilder(num);
		while (k > 0) {
			if (k > sb.length()) return "0";
			boolean find = false;
			for (int i = 0; i < sb.length()-1; i++) {
				if (sb.charAt(i) > sb.charAt(i+1)) {
					if (i == 0) {
						while (i < sb.length()-1 && sb.charAt(i+1) == '0') {
							i++;
						}
						sb.replace(0, i+1, "");
						k--;
					}
					else {
						sb.replace(i, i+1, "");
						k--;
					}
					find = true;
					break;
				}
			}
			if (!find) {
				sb.replace(sb.length() - k, sb.length(), "");
				break;
			}
		}
		if (sb.length() == 0) return "0";
		else return sb.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P402_RemoveKDigits k = new P402_RemoveKDigits();
		String s = k.removeKdigits("112", 1);
	}

}
