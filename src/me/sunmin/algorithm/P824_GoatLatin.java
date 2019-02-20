package me.sunmin.algorithm;
//https://leetcode.com/problems/goat-latin/
//Runtime: 5 ms, faster than 98.30% of Java online submissions for Goat Latin.

public class P824_GoatLatin {

	
	public String toGoatLatin(String S) {
		String[] ss = S.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ss.length; i++) {
			String si = ss[i];
			char c = si.charAt(0);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
					c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				sb.append(si);
			}
			else {
				sb.append(si, 1, si.length());
				sb.append(c);
			}
			sb.append("ma");
			for (int j = 0; j <= i; j++) {
				sb.append('a');
			}
			if (i != ss.length-1) sb.append(" ");
		}
		return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P824_GoatLatin g = new P824_GoatLatin();
		String s = g.toGoatLatin("I speak Goat Latin");
		s = g.toGoatLatin("The quick brown fox jumped over the lazy dog");
	}

}
