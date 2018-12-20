//https://leetcode.com/problems/longest-common-prefix/

package me.sunmin.algorithm;

public class LongestCommonPrefix {
	static public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int length = Integer.MAX_VALUE;
        for (String s : strs) {
    		if (s.length() < length) {
    			length = s.length();
    		}
    	}
        for (int i = 0; i < length; i++) {
        	char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
            	if (strs[j].charAt(i) != c) {
            		return sb.toString();
            	}
            }
            sb.append(c);
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"dog","racecar","car"};
		String s = LongestCommonPrefix.longestCommonPrefix(strs);
		s = LongestCommonPrefix.longestCommonPrefix(new String[] {"flower","flow","flight"});
	}

}
