package me.sunmin.algorithm;
//https://leetcode.com/problems/implement-strstr/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Implement strStr().

public class P028_ImplementstrStr {
	public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
		if (needle.length() < 10) {
			char hs[] = haystack.toCharArray();
			char ns[] = needle.toCharArray();
			for (int i = 0; i < hs.length - ns.length + 1; i++) {
				boolean match = true;
				for (int j = 0; j < ns.length; j++) {
					if (hs[i+j] != ns[j]) {
						match = false;
						break;
					}
				}
				if (match) {
					return i;
				}
			}
		}
		else {
			int hash = needle.hashCode();
			for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
				String sub = haystack.substring(i, i+needle.length());
				if (sub.hashCode() == hash && sub.equals(needle)) {
					return i;
				}
			}
		}
		return -1;

    }
}
