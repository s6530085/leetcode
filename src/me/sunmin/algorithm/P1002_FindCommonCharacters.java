package me.sunmin.algorithm;
//https://leetcode.com/problems/find-common-characters/
//Runtime: 7 ms, faster than 76.06% of Java online submissions for Find Common Characters.

import java.util.ArrayList;
import java.util.List;

public class P1002_FindCommonCharacters {
	public List<String> commonChars(String[] A) {
        
        char[][] cs = new char[A.length][26];
        for (int i = 0; i < A.length; i++) {
        	String s = A[i];
        	int l = s.length();
        	for (int j = 0; j < l; j++) {
        		cs[i][s.charAt(j) -'a']++;
        	}
        }
        
        List<String > list = new ArrayList<String>();
        for (int i = 0; i < 26; i++) {
        	int min = Integer.MAX_VALUE;;
        	for (int j = 0; j < cs.length; j++) {
        		if (cs[j][i] < min) {
        			min = cs[j][i];
        			if (min == 0) break;
        		}
        	}
       		while (min > 0) {
       			char c = (char)('a' + i);
       			list.add("" + c);
       			min--;
        	}
        }
        return list;
    }
}
