package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//https://leetcode.com/problems/top-k-frequent-elements/
//Runtime: 12 ms, faster than 88.16% of Java online submissions for Top K Frequent Elements.

public class P347_TopKFrequentElements {
		
	public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer>map = new HashMap<Integer, Integer>();
        for (int i : nums) {
        	Integer count = map.get(i);
        	if (count == null) {
        		map.put(i, 1);
        	}
        	else {
        		map.put(i, count+1);
        	}
        }
        List<Map.Entry<Integer, Integer>>l = new ArrayList();
        l.addAll(map.entrySet());
        Collections.sort(l, new Comparator<Map.Entry<Integer, Integer>>(){
        	@Override
    		public int compare(Map.Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
    			return o2.getValue() - o1.getValue();
    		}
        });
        List<Integer> list = new ArrayList();
        for (int i = 0; i < k; i++) {
        	list.add(l.get(i).getKey());
        }
        return list;
    }
	
	public static void main(String[] args) {
		P347_TopKFrequentElements e = new P347_TopKFrequentElements();
		Object c = e.topKFrequent(new int[] {1,1,1,2,2,3,3,3}, 2);
	}
}
