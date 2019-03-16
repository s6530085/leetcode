package me.sunmin.algorithm;
//https://leetcode.com/problems/roman-to-integer/
//Runtime: 34 ms, faster than 96.48% of Java online submissions for Roman to Integer.

public class P013_Roman2Integer {
	
	public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if (c == 'M') {
        		sum += 1000;
        	}
        	else if (c == 'D') {
        		sum += 500;
        	}
        	else if (c == 'C') {
        		if (i < s.length() - 1) {
        			if (s.charAt(i+1) == 'M') {
        				sum += 900;
        				i++;
        			}
        			else if (s.charAt(i+1) == 'D') {
        				sum += 400;
        				i++;
        			}
        			else {
        				sum += 100;
        			}
        		}
        		else {
        			sum += 100;
        		}
        	}
        	else if (c == 'L') {
        		sum += 50;
        	}
        	else if (c == 'X') {
        		if (i < s.length() - 1) {
        			if (s.charAt(i+1) == 'C') {
        				sum += 90;
        				i++;
        			}
        			else if (s.charAt(i+1) == 'L') {
        				sum += 40;
        				i++;
        			}
        			else {
        				sum += 10;
        			}
        		}
        		else {
        			sum += 10;
        		}
        	}
        	else if (c == 'V') {
        		sum += 5;
        	}
        	else if (c == 'I') {
        		if (i < s.length() - 1) {
        			if (s.charAt(i+1) == 'X') {
        				sum += 9;
        				i++;
        			}
        			else if (s.charAt(i+1) == 'V') {
        				sum += 4;
        				i++;
        			}
        			else {
        				sum += 1;
        			}
        		}
        		else {
        			sum += 1;
        		}
        	}
        }
        return sum;
    }
}
