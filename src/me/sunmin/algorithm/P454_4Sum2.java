package me.sunmin.algorithm;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/4sum-ii/
//Runtime: 74 ms, faster than 86.13% of Java online submissions for 4Sum II.

public class P454_4Sum2 {
	
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int a : A) for (int b : B) map.put(a+b, 1+map.getOrDefault(a+b, 0));
		for (int c : C) for (int d : D) count += map.getOrDefault(-c-d, 0);
		return count;
    }
}
