package me.sunmin.algorithm;
//https://leetcode.com/problems/reverse-words-in-a-string-iii/
//Runtime: 11 ms, faster than 78.16% of Java online submissions for Reverse Words in a String III.

public class P557_ReverseWordsInStringIII {
	public String reverseWords(String s) {
        char cs[] = s.toCharArray();
        int begin = 0;
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == ' ' || i == cs.length-1) {
                if (i == cs.length-1) {
                    i++;
                }
                for (int j = begin; j < begin + (i - begin) / 2; j++) {
                    char c = cs[j];
                    cs[j] = cs[i-j-1+begin];
                    cs[i-j-1+begin] = c;
                }
            begin = i+1;
            }
        }
        return new String(cs);
    }
}
