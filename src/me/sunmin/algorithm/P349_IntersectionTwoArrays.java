package me.sunmin.algorithm;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/intersection-of-two-arrays/
//Runtime: 2 ms, faster than 98.46% of Java online submissions for Intersection of Two Arrays.

public class P349_IntersectionTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer>set = new HashSet<Integer>();
		for (int n : nums1) {
			set.add(n);
		}
		Set<Integer>ss = new HashSet<Integer>();
		for (int n : nums2) {
			if (set.contains(n)) {
				ss.add(n);
			}
		}
		int r[] = new int[ss.size()];
		int index = 0;
		for (int i : ss) {
			r[index++] = i;
		}
		return r;
    }
}
