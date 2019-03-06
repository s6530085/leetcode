package me.sunmin.algorithm;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/
//Runtime: 3 ms, faster than 72.15% of Java online submissions for Intersection of Two Arrays II.


public class P350_IntersectionTwoArrays2 {
	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer>map = new HashMap<Integer, Integer>();
		for (int n : nums1) {
			Integer count = map.get(n);
			if (count == null) {
				map.put(n, 1);
			}
			else {
				map.put(n, count+1);
			}
		}
		int allCount = 0;
		Map<Integer, Integer> mm = new HashMap<Integer, Integer>();
		for (int n : nums2) {
			Integer count1 = map.get(n);
			if (count1 != null) {
				if (count1 > 0) {
					allCount++;
					if (count1 > 1) {
                        map.put(n, count1-1);
                    }
                    else {
                        map.remove(n);
                    }
					Integer count2 = mm.get(n);
					if (count2 == null) {
						mm.put(n, 1);
					}
					else {
						mm.put(n, count2+1);
					}
				}
				else {
					map.remove(n);
				}
			}
		}
		int r[] = new int[allCount];
		int index = 0;
		for (int k : mm.keySet()) {
			int c = mm.get(k);
			for (int i = 0; i < c; i++) {
				r[index++] = k;
			}
		}
		return r;
    }
	
	public static void main(String[] args) {
		P350_IntersectionTwoArrays2 a = new P350_IntersectionTwoArrays2();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(1, 100);
		Integer count = m.get(1);
		count++;
		Integer c2 = m.get(1);
		int [] r = a.intersect(new int[] {1,2,2,1}, new int[] {2,2});
	}
}
