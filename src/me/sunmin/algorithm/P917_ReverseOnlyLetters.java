package me.sunmin.algorithm;
//https://leetcode.com/problems/reverse-only-letters/
//Runtime: 4 ms, faster than 99.57% of Java online submissions for Reverse Only Letters.

public class P917_ReverseOnlyLetters {

	public String reverseOnlyLetters(String S) {
		char []cs = S.toCharArray();
		int lo = 0;
		int hi = cs.length-1;
		while(lo < hi) {
			char l = cs[lo];
			char h = cs[hi];
			if ( ((l >= 'a' && l <= 'z') || (l >= 'A' && l <= 'Z')) 
			&&   ((h >= 'a' && h <= 'z') || (h >= 'A' && h <= 'Z'))) {
				char c = l;
				cs[lo] = h;
				cs[hi] = c;
				lo++;
				hi--;
			}
			if (!((l >= 'a' && l <= 'z') || (l >= 'A' && l <= 'Z'))) {
				lo++;
			}
			if (!((h >= 'a' && h <= 'z') || (h >= 'A' && h <= 'Z'))) {
				hi--;
			}
		}
		return new String(cs);
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P917_ReverseOnlyLetters r = new P917_ReverseOnlyLetters();
		String s = r.reverseOnlyLetters("ab-cd");
		s = r.reverseOnlyLetters("a-bC-dEf-ghIj");
		s = r.reverseOnlyLetters("Test1ng-Leet=code-Q!");
	}

}
