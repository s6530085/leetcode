package me.sunmin.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//https://leetcode.com/problems/longest-word-in-dictionary/
//Runtime: 39 ms, faster than 22.40% of Java online submissions for Longest Word in Dictionary.
// todosm trie

public class P720_LongestWordDictionary {
	public String longestWord(String[] words) {
		Map<Integer, Set<String>> map = new HashMap<Integer, Set<String>>();
        for (String word : words) {
        	int l = word.length();
        	Set<String> list = map.get(l);
        	if (list == null) {
        		list = new HashSet<String>();
        		list.add(word);
        		map.put(l, list);
        	}
        	else {
        		list.add(word);
        	}
        }
        int length = 1;
        
        Set<String>longest = new TreeSet<String>(map.get(length));
        while(true) {
        	Set<String>next = map.get(length+1);
        	if (next == null) break;
        	Set<String> nls = new TreeSet<String>();
        	for (String ls : longest) {
        		for (String lls : next) {
        			if (lls.startsWith(ls)) {
        				nls.add(lls);
        			}
         		}
        	}
        	if (nls.isEmpty()) break;
        	longest = nls;
        	length++;
        }
        for (String s : longest) {
        	return s;
        }
		return null;
    }
	
	public static void main(String[] args) {
		P720_LongestWordDictionary p = new P720_LongestWordDictionary();
		String s = p.longestWord(new String[] {"a", "banana", "app", "appl", "ap", "apply", "apple"});
		
	}
}
