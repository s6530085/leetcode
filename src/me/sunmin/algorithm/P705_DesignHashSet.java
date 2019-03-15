package me.sunmin.algorithm;

//https://leetcode.com/problems/design-hashset/
//Runtime: 60 ms, faster than 99.72% of Java online submissions for Design HashSet.


public class P705_DesignHashSet {

	boolean[] sets = new boolean[1000000+1];
	 /** Initialize your data structure here. */
    public P705_DesignHashSet() {
        
    }
    
    public void add(int key) {
        sets[key] = true;
    }
    
    public void remove(int key) {
    	sets[key] = false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return sets[key];
    }
}
