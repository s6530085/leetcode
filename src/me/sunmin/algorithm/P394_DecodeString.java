package me.sunmin.algorithm;
//https://leetcode.com/problems/decode-string/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Decode String.

public class P394_DecodeString {
	
	public String decodeString(String s) {
		do {
			int back = s.indexOf(']');
			if (back < 0) break;
			for (int i = back - 1; i >= 0; i--) {
				if (s.charAt(i) == '[') {
					String repeatString = s.substring(i+1, back);
					String countString = "";
					while(i > 0) {
						char c = s.charAt(i-1);
						if (c >= '0' && c <= '9') {
							countString = "" + c + countString;
						}
						else {
							break;
						}
						i--;
					}
					String temp = repeatString;
					int repeat = Integer.valueOf(countString);
					for (int j = 1; j < repeat; j++) {
						repeatString += temp;
					}
					s = s.substring(0, i) + repeatString + s.substring(back+1);
					break;
				}
			}
		}while(true);
		return s;
    }
	
	public static void main(String []args) {
		P394_DecodeString d = new P394_DecodeString();
		String s = d.decodeString("abc");
		s = d.decodeString("a2[2[c]]");
	}
}
