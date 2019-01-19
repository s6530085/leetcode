//https://leetcode.com/problems/integer-to-roman/
//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//I can be placed before V (5) and X (10) to make 4 and 9. 
//X can be placed before L (50) and C (100) to make 40 and 90. 
//C can be placed before D (500) and M (1000) to make 400 and 900.
//Runtime: 37 ms, faster than 99.35% of Java online submissions for Container With Most Water.

package me.sunmin.algorithm;

import java.util.HashMap;
import java.util.Map;

public class P012_IntegerToRoman {
	static public String intToRoman(int num) {
        int[] intValues = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] stringValues = {"M","CM", "D","CD", "C", "XC","L","XL", "X","IX", "V", "IV","I"};
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while(num!=0) {
        	if (num >= intValues[index]) {
        		num -= intValues[index];
        		sb.append(stringValues[index]);
        	}
        	else {
        		index++;
        	}
        }
        
        return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = P012_IntegerToRoman.intToRoman(3);
		s = P012_IntegerToRoman.intToRoman(4);
		s = P012_IntegerToRoman.intToRoman(9);
		s = P012_IntegerToRoman.intToRoman(58);
		s = P012_IntegerToRoman.intToRoman(1994);
		
	}

}
