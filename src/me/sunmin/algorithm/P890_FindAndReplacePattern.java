package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/find-and-replace-pattern/
//Runtime: 7 ms, faster than 80.07% of Java online submissions for Find and Replace Pattern.


public class P890_FindAndReplacePattern {
	public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> l = new ArrayList<String>();
		for (String word : words) {
			Map<String, String> wpm = new HashMap<String, String>();
			Map<String, String> pwm = new HashMap<String, String>();
			boolean b = true;
			for (int i = 0; i < word.length(); i++) {
				String ws = word.substring(i, i+1);
				String ps = pattern.substring(i, i+1);
				String wpms = wpm.get(ws);
				String pwms = pwm.get(ps);
				if (wpms == null && pwms == null) {
					wpm.put(ws, ps);
					pwm.put(ps, ws);
				}
				else if (wpms != null && pwms != null) {
					if (!wpms.equals(ps) || !pwms.equals(ws)) {
						b = false;
						break;
					}
				}
				else {
					b = false;
					break;
				}
			}
			if (b) {
				l.add(word);
			}
		}
		
		return l;


    }
}
