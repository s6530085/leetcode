package me.sunmin.algorithm;
//https://leetcode.com/problems/distribute-candies/
//Runtime: 81 ms, faster than 80.36% of Java online submissions for Distribute Candies.

import java.util.HashSet;
import java.util.Set;

public class P575_DistributeCandies {
	public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<Integer>();
		for (int i : candies) {
			set.add(i);
		}
		return set.size() > candies.length/2 ? candies.length/2 : set.size();

    }
}
