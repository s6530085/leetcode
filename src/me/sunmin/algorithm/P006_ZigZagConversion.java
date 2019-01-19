//https://leetcode.com/problems/zigzag-conversion/
//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//And then read line by line: "PAHNAPLSIIGYIR"
//
//Write the code that will take a string and make this conversion given a number of rows:
//Runtime: 36 ms, faster than 94.94% of Java online submissions for ZigZag Conversion.

package me.sunmin.algorithm;

public class P006_ZigZagConversion {
	
	static public String convert(String s, int numRows) {
		if (numRows == 1)	return s;
		
        int l = s.length();
        int mod = numRows * 2 - 2;
        int col = (l / mod + (l % mod == 0 ? 0 : 1)) * (numRows - 1);
        char [][] array = new char[numRows][col];
        
        for (int index = 0; index < l; index++) {
        	char c = s.charAt(index);
        	// 根据index算出偏移量
        	int offsetCol = ((index+1) / mod + ((index+1) % mod == 0 ? 0 : 1) - 1) * (numRows - 1);
        	int offset = index % mod;
        	if (offset < numRows) {
        		array[offset][offsetCol] = c;
        	}
        	else {
        		array[numRows-offset%numRows-2][offsetCol+offset-numRows+1] = c;
        	}
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < numRows; i++) {
        	for (int j = 0; j < col; j++) {
        		if (array[i][j] != 0) {
        			sb.append(array[i][j]);
        		}
        	}
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(P006_ZigZagConversion.convert("ABCD", 3));
		System.out.println(P006_ZigZagConversion.convert("PAYPALISHIRING", 4));
	}
}
