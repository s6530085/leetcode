package me.sunmin.algorithm;
//https://leetcode.com/problems/reverse-vowels-of-a-string/
//Runtime: 2 ms, faster than 99.27% of Java online submissions for Reverse Vowels of a String.

public class P345_ReverseVowelsString {
	public String reverseVowels(String s) {
		char cs[] = s.toCharArray();
		int lo = 0;
		int hi = cs.length-1;
		while (lo < hi) {
			char lc = cs[lo];
			if (lc == 'a' || lc == 'e' || lc == 'i' || lc =='o' || lc == 'u' ||
					lc == 'A' || lc == 'E' || lc == 'I' || lc == 'O' || lc == 'U'	) {
				char hc = cs[hi];
				if (hc == 'a' || hc == 'e' || hc == 'i' || hc =='o' || hc == 'u' ||
						hc == 'A' || hc == 'E' || hc == 'I' || hc =='O' || hc == 'U') {
					char t = lc;
					cs[lo] = hc;
					cs[hi] = t;
					lo++;
					hi--;
				}
				else {
					hi--;
				}
			}
			else {
				lo++;
			}
		}
		return new String(cs);
    }
	
	public static void main(String[] args) {
		P345_ReverseVowelsString s = new P345_ReverseVowelsString();
		String ss = s.reverseVowels("leetcode");
	}
}
