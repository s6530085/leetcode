package me.sunmin.algorithm;
//https://leetcode.com/problems/rotate-string/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Rotate String.

public class P796_RotateString {
	public boolean rotateString(String A, String B) {
		if (A.length() != B.length()) return false;
		char[] as = A.toCharArray();
		char[] bs = B.toCharArray();
		if (as.length == 0) return true;
		for (int offset = 0; offset < bs.length; offset++) {
			boolean match = true;
			for (int i = 0; i < as.length - offset; i++) {
				if (as[i] != bs[offset+i]) {
					match = false;
					break;
				}
			}
			if (match) {
				for (int i = 0; i < offset; i++) {
					if (as[as.length - offset+i] != bs[i]) {
						match = false;
						break;
					}
				}
			}
			
			if (match) return true;
		}
		return false;
    }
	
	public static void main(String[] args) {
		P796_RotateString r = new P796_RotateString();
		boolean b = r.rotateString("a", "a");
	}
}
