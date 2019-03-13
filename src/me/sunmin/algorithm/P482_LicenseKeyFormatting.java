package me.sunmin.algorithm;
//https://leetcode.com/problems/license-key-formatting/
//Runtime: 5 ms, faster than 99.91% of Java online submissions for License Key Formatting.

public class P482_LicenseKeyFormatting {
	public String licenseKeyFormatting(String S, int K) {
		char cs[] = S.toCharArray();
		int alphaCount = 0;
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];
			if (c != '-') alphaCount++;
		}
		int count = 0;
		int initSpace = alphaCount % K;
		StringBuilder sb = new StringBuilder(alphaCount + alphaCount%K+1);
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];
			if (c == '-') continue;
			else {
				if (c >= 'a' && c <= 'z') {
					c -= 'a' - 'A';
				}
				sb.append(c);
				count++;
				if ((count - initSpace) % K == 0 && (count != alphaCount)) {
					sb.append('-');
				}
			}
		}		
		return sb.toString();
    }
}
