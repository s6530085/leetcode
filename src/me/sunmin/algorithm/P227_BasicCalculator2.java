package me.sunmin.algorithm;
//https://leetcode.com/problems/basic-calculator-ii/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Basic Calculator II.

public class P227_BasicCalculator2 {

	public int calculate(String s) {
		int result = 0;
		int current = 0;
		int prev = 0;
		boolean isMul = false;
		boolean isDiv = false;
		int sign = 1;
        char cs[] = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
        	char c = cs[i];
        	if (c == ' ') continue;
        	if (c >= '0' && c <= '9') {
        		current = current * 10 + c - '0';
        	}
        	else {
        		if (isMul) current = prev * current;
        		if (isDiv) current =  prev / current;
        		
        		isMul = false;
    			isDiv = false;
        		if (c == '+') {
        			result += current * sign;
        			current = 0;
        			sign = 1;
        		}
        		else if (c == '-') {
        			result += current * sign;
        			current = 0;
        			sign = -1;
        		}
        		else  if (c == '*') {
        			prev = current;
        			current = 0;
        			isMul = true;
        		}
        		else if (c == '/') {
        			prev = current;
        			current = 0;
        			isDiv = true;
        		}
        	}
        }
        if (isMul) current = prev * current;
        if (isDiv) current = prev / current;
        result += current * sign;
        
        return result;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P227_BasicCalculator2 c = new P227_BasicCalculator2();
		int i = c.calculate("1+1-1");
	}

}
