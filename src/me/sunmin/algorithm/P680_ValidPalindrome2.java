package me.sunmin.algorithm;
//https://leetcode.com/problems/valid-palindrome-ii/description/
//Runtime: 4 ms, faster than 99.93% of Java online submissions for Valid Palindrome II.

public class P680_ValidPalindrome2 {
	public boolean validPalindrome(String s) {
		char[] cs = s.toCharArray();
		int wrong = 0;
		int backupI = 0;
		int backupJ = 0;
		int i = 0;
		int j = cs.length-1;
		while (i < j) {
			if (cs[i] == cs[j]) {
				i++;
				j--;
			}
			else {
				if (wrong == 0 || wrong == 1) {
					if (i == j - 1) {
						return true;
					}
					else {
						if (wrong == 0) {
							if (cs[i+1] == cs[j]) {
								backupI = i;
								backupJ = j-1;
								i += 2;
								j--;
							}
							else if (cs[i] == cs[j-1]) {
								backupI = i+1;
								backupJ = j;
								i++;
								j -= 2;
							}
							else {
								
								return false;
							}
							wrong = 1;
						}
						else {
							i = backupI;
							j = backupJ;
							if (cs[i] == cs[j]) {
								i++;
								j--;
							}
							else {
								return false;
							}
							wrong = 2;
						}
					}
					
				}
				else {
					return false;
				}
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		P680_ValidPalindrome2 p = new P680_ValidPalindrome2();
		boolean b = p.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga");
		int i = 100;
	}
}
