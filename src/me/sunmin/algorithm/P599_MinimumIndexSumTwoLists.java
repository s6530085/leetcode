package me.sunmin.algorithm;
//https://leetcode.com/problems/minimum-index-sum-of-two-lists/
//Runtime: 8 ms, faster than 100.00% of Java online submissions for Minimum Index Sum of Two Lists.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P599_MinimumIndexSumTwoLists {
	
	public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < list1.length; i++) {
        	String s1 = list1[i];
        	map.put(s1, i);
        }
        List<String> l = new ArrayList<String>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
        	String s2 = list2[i];
        	Integer i1 = map.get(s2);
        	if (i1 != null) {
        		if (i1 + i < min) {
        			l.clear();
        			l.add(s2);
        			min = i1 + i;
        		}
        		else if (i1 + i == min) {
        			l.add(s2);
        		}
        	}
        }
        return l.toArray(new String[0]);
    }
	
}
