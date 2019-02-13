package me.sunmin.algorithm;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//https://leetcode.com/problems/subsets/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Subsets.


public class P078_Subsets {
	
	private void p(int begin, int size, int[] nums, List<Integer>l, List<List<Integer>>ls) {
		ls.add(l);
		if (size == nums.length) return;
		for (int i = begin; i < nums.length; i++) {
			List<Integer> nl = new ArrayList<Integer>(l);
			l.add(nums[i]);
			p(i+1, size+1, nums, nl, ls);
		}
	}
	
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>>ls = new ArrayList<List<Integer>>();
		List<Integer> l = new ArrayList<Integer>();
		p(0, 0, nums, l, ls);
	
		return ls;
    }

	public static void main(String[] args) {
		P078_Subsets s = new P078_Subsets();
		List<List<Integer>> l = s.subsets(new int[] {1,2,3});
	}
}
