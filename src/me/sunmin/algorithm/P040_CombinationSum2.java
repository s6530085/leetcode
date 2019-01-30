package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/combination-sum-ii/
//Runtime: 36 ms, faster than 13.92% of Java online submissions for Combination Sum II.
// todosm

public class P040_CombinationSum2 {
	private void pcs(int i, int[] candidates, int target, int sum, List<Integer>l, List<List<Integer>>list) {
		
		List<Integer> nl = new ArrayList<Integer>(l);
		if (sum == target) {
			if (!list.contains(nl)) list.add(nl);
			return;
		}
		if (i == candidates.length) {
			return;
		}
		
		pcs(i+1, candidates, target, sum, nl, list);
		if (sum + candidates[i] <= target) {
			nl.add(candidates[i]);
			pcs(i+1, candidates, target, sum+candidates[i], nl, list);
		}
	}
	
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        pcs(0, candidates, target, 0, new ArrayList<Integer>(), list);
        return list;		
    }
}
