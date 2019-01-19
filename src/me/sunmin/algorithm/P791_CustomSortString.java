package me.sunmin.algorithm;
//https://leetcode.com/problems/custom-sort-string/
//Runtime: 5 ms, faster than 50.53% of Java online submissions for Custom Sort String.
// todosm
public class P791_CustomSortString {
	public String customSortString(String S, String T) {
        char[] cs = S.toCharArray();
		char[] ts = T.toCharArray();
		int begin = 0;
		for (char c : cs) {
			for (int i = begin; i < ts.length; i++) {
				if (ts[i] == c) {
					if (i != begin) {
						ts[i] = ts[begin];
						ts[begin] = c;
					}
					begin++;
				}
			}
		}
		return new String(ts);

    }
}
