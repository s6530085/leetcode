package me.sunmin.algorithm;
//https://leetcode.com/problems/compare-version-numbers/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Compare Version Numbers.

public class P165_CompareVersionNumbers {

	public int compareVersion(String version1, String version2) {
		char[] cs1 = version1.toCharArray();
		char[] cs2 = version2.toCharArray();
		int begin1 = 0;
		int begin2 = 0;
		while(true) {
			int v1 = 0;
			int v2 = 0;
			for (int i = begin1; i < cs1.length; i++) {
				char c = cs1[i];
				if (c == '.') {
					begin1 = i+1;
					break;
				}
				else {
					v1 = v1 * 10 + c - '0';
					if (i == cs1.length - 1) {
						begin1 = i+1;
					}
				}
			}
			for (int i = begin2; i < cs2.length; i++) {
				char c = cs2[i];
				if (c == '.') {
					begin2 = i+1;
					break;
				}
				else {
					v2 = v2 * 10 + c - '0';
					if ( i == cs2.length - 1) {
						begin2 = i+1;
					}
				}
			}
			if (v1 > v2) {
				return 1;
			}
			else if (v1 < v2) {
				return -1;
			}
			
			if (begin1 == cs1.length && begin2 == cs2.length) {
				break;
			}
		}
		return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P165_CompareVersionNumbers p = new P165_CompareVersionNumbers();
		int i = p.compareVersion("1.1", "1.0");
		i = p.compareVersion("1.15", "1.10");
		i = p.compareVersion("1.1.1", "1.0.1");
		i = p.compareVersion("1.1.0", "1.1");
		i = p.compareVersion("3.1", "1.0");
		i = p.compareVersion("310.23", "310.023.0");
		i = p.compareVersion("1.2.3", "2.1");
	}

}
