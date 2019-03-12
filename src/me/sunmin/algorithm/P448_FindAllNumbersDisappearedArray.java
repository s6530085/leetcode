package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//Runtime: 5 ms, faster than 100.00% of Java online submissions for Find All Numbers Disappeared in an Array.
//todosm Could you do it without extra space and in O(n) runtime? 

public class P448_FindAllNumbersDisappearedArray {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> l = new ArrayList<Integer>();
		boolean has[] = new boolean[nums.length];
		for (int n : nums) {
			has[n-1] = true;
		}
		for (int i = 0; i < has.length; i++) {
			if (has[i] == false) {
				l.add(i+1);
			}
		}
		return l;
    }
}
