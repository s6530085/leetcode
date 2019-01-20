package me.sunmin.algorithm;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
//Runtime: 15 ms, faster than 81.07% of Java online submissions for Find All Duplicates in an Array.

import java.util.ArrayList;
import java.util.List;

public class P442_FindAllDuplicatesInArray {
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<Integer>();
		int begin = 0;
		while (begin < nums.length) {
			int value = nums[begin];
			if (value == 0) {
				begin++;
			}
			else {
				if (value == begin+1) {
					nums[begin] = 0;
					begin++;
				}
				else {
					int sValue = nums[value-1];
					if (sValue == -1) {
						nums[value-1] = 0;
						nums[begin] = -1;
						begin++;
					}
					else if (sValue == 0) {
						l.add(value);
						nums[begin] = -1;
						begin++;
					}
					else {
						nums[begin] = sValue;
						nums[value-1] = 0;
					}
				}
			}
		}
		return l;

    }
}
