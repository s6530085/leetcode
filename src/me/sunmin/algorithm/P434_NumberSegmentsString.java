package me.sunmin.algorithm;
//https://leetcode.com/problems/number-of-segments-in-a-string/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Number of Segments in a String.
//category:string

public class P434_NumberSegmentsString {
	
	public int countSegments(String s) {
		int count = 0;
		int length = s.length();
		boolean inSegment = false;
		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);
			if (i == length - 1) {
				if (inSegment) {
					count++;
				}
				else {
                    if (!Character.isWhitespace(c)) {
                    	count++;
                    }
                }
			}
			else {
				if (Character.isWhitespace(c)) {
					if (inSegment) {
						count++;
						inSegment = false;
					}
				}
				else {
					inSegment = true;
				}
			}
		}
		
		return count;
    }
	
	public static void main(String[] args) {
		
		P434_NumberSegmentsString s= new P434_NumberSegmentsString();
		int i = s.countSegments("a, b, c");
	}
	
}
