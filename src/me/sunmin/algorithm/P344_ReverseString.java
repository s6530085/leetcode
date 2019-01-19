package me.sunmin.algorithm;
//https://leetcode.com/problems/reverse-string/
//Runtime: 2 ms, faster than 99.34% of Java online submissions for Reverse String.

public class P344_ReverseString {
	public String reverseString(String s) {
        char cs[] = s.toCharArray();
        int length = s.length();
        for (int i = 0; i < length/2; i++) {
            char c = cs[i];
            cs[i] = cs[length-i-1];
            cs[length-i-1] = c;
        }
        return new String(cs);
    }
}
