package me.sunmin.algorithm;
//https://leetcode.com/problems/most-common-word/
//Runtime: 26 ms, faster than 37.33% of Java online submissions for Most Common Word.

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P819_MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {
		paragraph = paragraph.toLowerCase();
        String[] ss = paragraph.split("[^\\w]");
        Map<String, Integer> map = new HashMap<String, Integer>();
        Set<String> bans = new HashSet<String>();
        Collections.addAll(bans, banned);
        for (String s : ss) {
        	if (s.length() > 0 && !bans.contains(s)) {
        		int i = map.getOrDefault(s, 0);
        		map.put(s, i+1);
        	}
        }
        String max = "";
        int maxCount = 0;
        for (String k : map.keySet()) {
        	int c = map.get(k);
        	if (c > maxCount) {
        		maxCount = c;
        		max = k;
        	}
        }
        return max;
    }
	
	public static void main(String[] args) {
		P819_MostCommonWord w = new P819_MostCommonWord();
		w.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"});
	}
}
