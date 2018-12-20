//https://leetcode.com/problems/string-to-integer-atoi/
//mplement atoi which converts a string to an integer.
//
//The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
//
//The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
//
//If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
//
//If no valid conversion could be performed, a zero value is returned.
//
//Note:
//
//Only the space character ' ' is considered as whitespace character.
//Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.

package me.sunmin.algorithm;

public class StringToInteger {
	
	static public int myAtoi(String str) {
        boolean negative = false;
        boolean inNumber = false;
        int digit = 0;
        int[] digits = new int[10]; 
        for (int i = 0; i < str.length(); i++) {
        	char c = str.charAt(i);
        	if (c == '+' || c == '-') {
        		if (!inNumber) {
        			negative = (c == '-');
        			inNumber = true;
        		}
        		else {
        			break;
        		}
        	}
        	else if (c >= '0' && c <= '9') {
        		inNumber = true;
        		// 如果超过10位，可以直接认为超过最大值了
        		if (digit >= 10) {
        			return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        		}
        		else {
        			// 如果是开头的0要丢弃
        			if (digit == 0 && c == '0') {
        				continue;
        			}
        			digits[digit++] = c - '0';
        		}
        	}
        	else if (c == ' '){
        		// 只有最前面的空格可以无视
        		if (digit == 0 && inNumber == false) {
        			continue;
        		}
        		else {
        			break;
        		}
        	}
        	else {
        		break;
        	}
        }
        
        if (digit == 0) {
        	return 0;
        }
        
        long value = 0;
        for (int i = 0; i < digit; i++) {
        	value += digits[i] * Math.pow(10, digit-i-1);
        }
        if (negative) value = -value;
        if (value > Integer.MAX_VALUE) {
        	return Integer.MAX_VALUE;
        }
        else if (value < Integer.MIN_VALUE) {
        	return Integer.MIN_VALUE;
        }
        else {
        	return (int)value;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = StringToInteger.myAtoi("-42");
		a = StringToInteger.myAtoi("   -42");
		a = StringToInteger.myAtoi("4193 with words");
		a = StringToInteger.myAtoi("words and 987");
		a = StringToInteger.myAtoi("-91283472332");
		a = StringToInteger.myAtoi("  0000000000012345678");
		
	}

}
