package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/permutations-ii/
//Runtime: 4 ms, faster than 64.56% of Java online submissions for Permutations II.


public class P047_Permutations2 {
	private void p(List<Integer>added, List<Integer>remain, List<List<Integer>>list) {
		if (remain.size() == 0) {
			list.add(added);
			return;
		}
		for (int i = 0; i < remain.size(); i++) {
			if ((i == 0) || (i > 0 && remain.get(i) != remain.get(i-1))) {
				List<Integer> al = new ArrayList<Integer>(added);
				List<Integer> rl = new ArrayList<Integer>(remain);
				al.add(remain.get(i));
				rl.remove(remain.get(i));
				p(al, rl, list);
			}
			
		}
	}
	
	public List<List<Integer>> permuteUnique(int[] nums) {
		Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        List<Integer> remain = new ArrayList<Integer>();
        for (int i : nums) {
        	remain.add(i);
        }
        p(new ArrayList<Integer>(), remain, list);
        
        
        return list;
    }

}
