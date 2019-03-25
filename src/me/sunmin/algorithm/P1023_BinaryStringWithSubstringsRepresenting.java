package me.sunmin.algorithm;
//https://leetcode.com/problems/binary-string-with-substrings-representing-1-to-n/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary String With Substrings Representing 1 To N

public class P1023_BinaryStringWithSubstringsRepresenting {
	
	public boolean queryString(String S, int N) {
		for (int i = 1; i <= N; i++) {
			String b = "";
			int temp = i;
			while (temp > 0) {
				b = ((temp & 1) == 0 ? "0" : "1") + b;
				temp >>= 1;
			}
			if (S.indexOf(b) < 0) return false;
		}
		return true;
		
    }
	
	
	public static void main(String[] args) {
		P1023_BinaryStringWithSubstringsRepresenting b = new P1023_BinaryStringWithSubstringsRepresenting();
		boolean bb = b.queryString("0110", 3);
	}
}
