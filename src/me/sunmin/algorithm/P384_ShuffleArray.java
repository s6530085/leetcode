package me.sunmin.algorithm;

import java.util.Random;

//https://leetcode.com/problems/shuffle-an-array/
//Runtime: 120 ms, faster than 80.36% of Java online submissions for Shuffle an Array.

public class P384_ShuffleArray {
	public P384_ShuffleArray(int[] nums) {
        origins = nums;
        arrays = origins.clone();
    }
	
    private int[] arrays;
    private int[] origins;
    private Random r = new Random();
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
    	arrays = origins.clone();
    	return origins;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    	for (int i = 0; i < arrays.length; i++) {
    		int j = i + r.nextInt(arrays.length-i);
    		int temp = arrays[i];
    		arrays[i] = arrays[j];
    		arrays[j] = temp;
    	}
    	
    	return arrays;
    }
}
