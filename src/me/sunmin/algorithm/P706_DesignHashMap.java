package me.sunmin.algorithm;

import java.util.Arrays;

//https://leetcode.com/problems/design-hashmap/
//Runtime: 70 ms, faster than 85.79% of Java online submissions for Design HashMap.

public class P706_DesignHashMap {
	
	private int[] maps;
	/** Initialize your data structure here. */
    public P706_DesignHashMap() {
        maps = new int[1000000+1];
        Arrays.fill(maps, -1);
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        maps[key] = value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return maps[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        maps[key] = -1;
    }
}
