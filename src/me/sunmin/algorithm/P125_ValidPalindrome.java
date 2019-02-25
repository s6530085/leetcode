package me.sunmin.algorithm;
//https://leetcode.com/problems/valid-palindrome/
//todosm fuckyou
public class P125_ValidPalindrome {
	
	public boolean isPalindrome(String s) {
		char cs[] = s.toLowerCase().toCharArray();
		int lo = 0;
		int hi = cs.length - 1;
		while (lo < hi) {
			char cl = cs[lo];
			char ch = cs[hi];
			if ((cl >= 'a' && cl <= 'z') && (ch >= 'a' && ch <= 'z')) {
				if (cl != ch) {
					return false;
				}
				else {
					lo++;
					hi--;
				}
			}
			else {
				if (cl < 'a' || cl > 'z') {
					lo++;
				}
				if (ch < 'a' || ch > 'z') {
					hi--;
				}
			}
		}
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P125_ValidPalindrome v = new P125_ValidPalindrome();
		boolean b = v.isPalindrome("OP");

	}

}
