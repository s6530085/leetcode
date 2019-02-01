package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/group-anagrams/
//Runtime: 15 ms, faster than 63.16% of Java online submissions for Group Anagrams.

public class P049_GroupAnagrams {
	private static int primes[] = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,73, 79, 83, 89, 97,101, 103, 107, 109, 113};

	private class OA implements Comparable {
		public int ana;
		public String s;
		public OA(int _ana, String _s) {
			ana = _ana;
			s = _s;
		}

		@Override
		public int compareTo(Object o) {
			return this.ana - ((OA)o).ana;
		}
	}

	private int anagrams(String s) {
		char cs[] = s.toCharArray();
		int i = 1;
		for (int j = 0; j < cs.length; j++) {
			int index = (int)(cs[j] - 'a'); 
			i *= primes[index]; 
		}
		return Math.abs(i);
	}
	
	public List<List<String>>groupAnagrams(String []strs) {
		List<List<String>> list = new ArrayList<List<String>>();
		
		OA []os = new OA[strs.length];
		for (int i = 0; i < strs.length; i++) {
			OA o = new OA(anagrams(strs[i]), strs[i]);
			os[i] = o;
		}
		Arrays.sort(os);
		List<String> l  = new ArrayList<String>();
		for (int i = 0; i < os.length; i++) {
			l.add(os[i].s);
			if (i == os.length-1 || os[i].ana != os[i+1].ana) {
				list.add(new ArrayList<String>(l));
				l.clear();
			}
		}
		return list;
	}
}
