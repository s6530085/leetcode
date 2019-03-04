package me.sunmin.algorithm;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/single-number-iii/
//

public class P260_SingleNumber3 {
	public int[] singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int n : nums) {
			if (set.contains(n)) set.remove(n);
			else set.add(n);
		}
		int r[] = new int[2];
		
		int i = 0;
		for (int k : set) {
			r[i++] = k;
		}
		return r;
    }
}
