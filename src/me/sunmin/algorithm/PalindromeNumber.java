//https://leetcode.com/problems/palindrome-number/
//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

package me.sunmin.algorithm;

public class PalindromeNumber {
	
	static public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        char[] digits = {0,0,0,0,0,0,0,0,0,0};
        int digit = 0;
        while(x>0) {
        	digits[digit++] = (char)(x%10);
        	x /= 10;
        }
        for (int i = 0; i < digit/2; i++) {
        	if (digits[i] != digits[digit-i-1]) {
        		return false;
        	}
        }
        return true;
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = PalindromeNumber.isPalindrome(121);
		b = PalindromeNumber.isPalindrome(-121);
		b = PalindromeNumber.isPalindrome(10);
	}

}
