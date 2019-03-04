package me.sunmin.algorithm;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/contains-duplicate-ii/
//Runtime: 8 ms, faster than 90.58% of Java online submissions for Contains Duplicate II.


public class P219_ContainsDuplicate2 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer>map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			Integer j = map.get(nums[i]);
			if (j == null) map.put(nums[i], i);
			else {
				if (i - j <= k) {
					return true;
				}
				else {
					map.put(nums[i], i);
				}
			}
		}
		return false;
    }
}
