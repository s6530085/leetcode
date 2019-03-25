package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/insert-delete-getrandom-o1/
//Runtime: 55 ms, faster than 94.38% of Java online submissions for Insert Delete GetRandom O(1).

public class P380_InsertDeleteGetRandom {
	
	/** Initialize your data structure here. */
    public P380_InsertDeleteGetRandom() {
        
    }
    
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    List<Integer> list = new ArrayList<Integer>();
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
        	return false;
        }
        else {
        	map.put(val, list.size());
        	list.add(val);
        	return true;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    	if (map.containsKey(val)) {
    		int index = map.get(val);
    		int swapValue = list.get(list.size()-1);
    		list.set(index, swapValue);
    		map.put(swapValue, index);
    		map.remove(val);
    		list.remove(list.size()-1);
    		return true;
        }
        else {
        	return false;
        }
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int count = (int)(Math.random() * list.size());
        return list.get(count);
    }
    
}
