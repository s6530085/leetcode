//https://leetcode.com/problems/longest-palindromic-substring/
//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//Runtime: 24 ms, faster than 64.44% of Java online submissions for Longest Palindromic Substring.

package me.sunmin.algorithm;

public class P005_LongestPalindromicSubstring {
	
	static public boolean isPalindrome(char[] cs, int begin, int end) {
		if (begin == end) return false;
		boolean p = true;
		for (int i = begin; i < begin + (end-begin)/2; i++) {
			if (cs[i] != cs[end-i-1]) {
				p = false;
				break;
			}
		}
		return p;
	}
	
	static public int[] palindromeBrace(char[] cs, int middle) {
		int space = Math.min(cs.length - middle - 1, middle);
		int[] brace = {middle, middle+1};
		// 回文可能是奇数也可能是偶数哦
		for (int i = 1; i <= space; i++) {
			if (cs[middle-i] == cs[middle+i]) {
				brace[0] = middle-i;
				brace[1] = middle+i+1;
			}
			else {
				break;
			}
		}
		int braceLength = brace[1] - brace[0];
		for (int j = 0; j <= space && middle+j+1 < cs.length; j++) {
			if (cs[middle-j] == cs[middle+j+1]) {
				if (2*j +2 > braceLength) {
					brace[0] = middle-j;
					brace[1] = middle+j+1+1;
				}
			}
			else {
				break;
			}
		}
		
		return brace;
	}
	
	static public String longestPalindrome(String s) {
		char cs[] = s.toCharArray();
		int longestBegin = 0;
		int longestEnd = 0;
		for (int i = 0; i < cs.length; i++) {
//			if (longestEnd - longestBegin > cs.length - i) break;
			int[] brace = P005_LongestPalindromicSubstring.palindromeBrace(cs, i);
			if (brace[1] - brace[0] > longestEnd - longestBegin) {
				longestBegin = brace[0];
				longestEnd = brace[1];
			}
		}
		
		return s.substring(longestBegin, longestEnd);
    }

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
//		String s = LongestPalindromicSubstring.longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		String s = P005_LongestPalindromicSubstring.longestPalindrome("abababa");
		s = P005_LongestPalindromicSubstring.longestPalindrome("a");
		s = P005_LongestPalindromicSubstring.longestPalindrome("aba");
		s = P005_LongestPalindromicSubstring.longestPalindrome("ababa");
		s = P005_LongestPalindromicSubstring.longestPalindrome("abababa");
		s = P005_LongestPalindromicSubstring.longestPalindrome("ababababa");
		s = P005_LongestPalindromicSubstring.longestPalindrome("abababababa");
		s = P005_LongestPalindromicSubstring.longestPalindrome("abccba");
		int a = 0;
	}

}
