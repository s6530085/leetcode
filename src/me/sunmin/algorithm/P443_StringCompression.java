package me.sunmin.algorithm;
//https://leetcode.com/problems/string-compression/
//Runtime: 3 ms, faster than 99.97% of Java online submissions for String Compression.

public class P443_StringCompression {
	
	public int compress(char[] chars) {
		if (chars.length < 2) return chars.length;
		int index = 0;
		char last = chars[0];
		int count = 1;
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == last) {
				count++;
				if (i == chars.length-1) {
					chars[index] = last;
					index++;
					if (count == 1) {
						
					}
					else if (count < 10) {
						chars[index] = (char)('0' + count);
						index++;
					}
					else if (count < 100) {
						chars[index] = (char)('0' + count/10);
						index++;
	            		chars[index] = (char)('0' + count%10);
	                    index++;
					}
					else if (count <999) {
						chars[index] = (char)('0' + (count/100)%10);
						index++;
						chars[index] = (char)('0' + (count/10)%10);
						index++;
	                    chars[index] = (char)('0' + count%10);
	                    index++;
					}
					else {
						chars[index] = '1';
						index++;
						chars[index] = '0';
						index++;
						chars[index] = '0';
						index++;
						chars[index] = '0';
	                    index++;
					}
				}
			}
			else {
				if (i != chars.length - 1) {
					chars[index] = last;
					index++;
					if (count == 1) {
						
					}
					else if (count < 10) {
						chars[index] = (char)('0' + count);
						index++;
					}
					else if (count < 100) {
						chars[index] = (char)('0' + count/10);
						index++;
	            		chars[index] = (char)('0' + count%10);
	                    index++;
					}
					else if (count <999) {
						chars[index] = (char)('0' + (count/100)%10);
						index++;
						chars[index] = (char)('0' + (count/10)%10);
						index++;
	                    chars[index] = (char)('0' + count%10);
	                    index++;
					}
					else {
						chars[index] = '1';
						index++;
						chars[index] = '0';
						index++;
						chars[index] = '0';
						index++;
						chars[index] = '0';
	                    index++;
					}
					last = chars[i];
					count = 1;
				}
				else {
					chars[index] = last;
					index++;
					if (count == 1) {
						
					}
					else if (count < 10) {
						chars[index] = (char)('0' + count);
						index++;
					}
					else if (count < 100) {
						chars[index] = (char)('0' + count/10);
						index++;
	            		chars[index] = (char)('0' + count%10);
	                    index++;
					}
					else if (count <999) {
						chars[index] = (char)('0' + (count/100)%10);
						index++;
						chars[index] = (char)('0' + (count/10)%10);
						index++;
	                    chars[index] = (char)('0' + count%10);
	                    index++;
					}
					else {
						chars[index] = '1';
						index++;
						chars[index] = '0';
						index++;
						chars[index] = '0';
						index++;
						chars[index] = '0';
	                    index++;
					}
					chars[index] = chars[i];
					index++;
				}
			}
		}
		return index;
    }
	
	
	
	public static void main(String[] args) {
		P443_StringCompression c = new P443_StringCompression();
		int i = c.compress(new char[] {'a', 'a'});
				//{'y','y','y','q','k','n','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c','c'});
	}
	
}
