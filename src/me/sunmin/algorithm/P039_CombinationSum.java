package me.sunmin.algorithm;
//https://leetcode.com/problems/combination-sum/
//Runtime: 68 ms, faster than 7.65% of Java online submissions for Combination Sum.
//todosm

import java.util.ArrayList;
import java.util.List;

public class P039_CombinationSum {
private List<List<Integer>> list = new ArrayList<List<Integer>>();
	
	private void addSum(int[] candidates, int target, int sum, List<Integer> l) {
		for (int i = 0; i < candidates.length; i++) {
			int candy = candidates[i];
			if (sum + candy <= target) {
				List<Integer> nl = new ArrayList<Integer>(l);
				if (sum + candy == target) {
					if (nl.size() == 0) {
						nl.add(candy);
					}
					else {
						for (int j = 0; j < nl.size(); j++) {
							if (nl.get(j) <= candy) {
								nl.add(j, candy);
								break;
							}
							else {
								if (j == nl.size() - 1) {
									nl.add(nl.size(), candy);
									break;
								}
							}
						}
					}
					if (!list.contains(nl)) list.add(nl);
				}
				else {
					if (nl.size() == 0) {
						nl.add(candy);
					}
					else {
						for (int j = 0; j < nl.size(); j++) {
							if (nl.get(j) <= candy) {
								nl.add(j, candy);
								break;
							}
							else {
								if (j == nl.size() - 1) {
									nl.add(nl.size(), candy);
									break;
								}
							}
						}
					}
					addSum(candidates, target, sum+candy, nl);
				}
			}
		}
	}
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        list.clear();
        addSum(candidates, target, 0, new ArrayList<Integer>());
        return list;
    }
}
