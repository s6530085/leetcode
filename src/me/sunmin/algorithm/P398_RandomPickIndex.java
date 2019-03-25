package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/random-pick-index/
//Runtime: 112 ms, faster than 76.45% of Java online submissions for Random Pick Index.

public class P398_RandomPickIndex {

	public P398_RandomPickIndex(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			List<Integer> l = map.get(nums[i]);
			if (l == null) {
				l = new ArrayList<Integer>();
				map.put(nums[i], l);
			}
			l.add(i);
		}
    }
    
	private Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
	
    public int pick(int target) {
        List<Integer>l = map.get(target);
        return l.get((int)(Math.random()*l.size()));
    	
    }
    
    public static void main(String[] args) {
    	P398_RandomPickIndex p = new P398_RandomPickIndex(new int[] {1,2,3,3,3});
    	int i =p .pick(3);
    }
}
