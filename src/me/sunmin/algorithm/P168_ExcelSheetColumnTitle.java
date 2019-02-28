package me.sunmin.algorithm;
//https://leetcode.com/problems/excel-sheet-column-title/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Title.

public class P168_ExcelSheetColumnTitle {
	
	public String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while(n > 0) {
			int remain = (n-1) % 26;
			char c = (char) ('A' + remain);
			sb.insert(0, c);
			n = (n-1)/26;
		}
		return sb.toString();
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P168_ExcelSheetColumnTitle e = new P168_ExcelSheetColumnTitle();
		String s = e.convertToTitle(1);
		s = e.convertToTitle(26);
		s = e.convertToTitle(27);
		s = e.convertToTitle(701);
	}

}
