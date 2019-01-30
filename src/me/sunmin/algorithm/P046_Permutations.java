package me.sunmin.algorithm;
//https://leetcode.com/problems/permutations/
//Runtime: 3 ms, faster than 64.21% of Java online submissions for Permutations.

import java.util.ArrayList;
import java.util.List;

public class P046_Permutations {
	private void p(List<Integer>added, List<Integer>remain, List<List<Integer>>list) {
		if (remain.size() == 0) {
			list.add(added);
			return;
		}
		for (int i = 0; i < remain.size(); i++) {
			List<Integer> al = new ArrayList<Integer>(added);
			List<Integer> rl = new ArrayList<Integer>(remain);
			al.add(remain.get(i));
			rl.remove(remain.get(i));
			p(al, rl, list);
		}
	}
	
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> l = new ArrayList<Integer>();
		for (int i : nums) {
			l.add(i);
		}
		p(new ArrayList<Integer>(), l, list);
		
		return list;
    }
}
