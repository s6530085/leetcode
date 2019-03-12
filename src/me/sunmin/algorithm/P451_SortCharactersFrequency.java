package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/sort-characters-by-frequency/
//Runtime: 14 ms, faster than 92.31% of Java online submissions for Sort Characters By Frequency.

public class P451_SortCharactersFrequency {
	
	private class SC implements Comparable {
		char c;
		int i;
		SC(char _c, int _i) {
			c = _c;
			i = _i;
		}
		@Override
		public int compareTo(Object o) {
			SC s2 = (SC)o;
			return s2.i - this.i;
		}
		
		
	}
	
	public String frequencySort(String s) {
		char cs[] = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : cs) {
			int i = map.getOrDefault(c, 0);
			map.put(c, i+1);
		}
		List<SC> l = new ArrayList<SC>();
		for (char c : map.keySet()) {
			SC sc = new SC(c, map.get(c));
			l.add(sc);
		}
		Collections.sort(l);
		
		StringBuilder sb = new StringBuilder();
		for (SC sc : l) {
			char cc[] = new char[sc.i];
			Arrays.fill(cc, sc.c);
			sb.append(cc);
		}
		return sb.toString();
    }
}
