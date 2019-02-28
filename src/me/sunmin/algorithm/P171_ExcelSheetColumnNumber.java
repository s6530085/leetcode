package me.sunmin.algorithm;
//https://leetcode.com/problems/excel-sheet-column-number/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Number.


public class P171_ExcelSheetColumnNumber {
	
	public int titleToNumber(String s) {
		int r = 0;
		char[]cs = s.toCharArray();
		for (int i = cs.length-1; i >= 0; i--) {
			r += Math.pow(26, cs.length-1-i) * (cs[i] - 'A' + 1);
		}
		return r;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P171_ExcelSheetColumnNumber e = new P171_ExcelSheetColumnNumber();
		int i = e.titleToNumber("A");
		i = e.titleToNumber("Z");
		i = e.titleToNumber("AA");
		i = e.titleToNumber("ZY");
	}

}
