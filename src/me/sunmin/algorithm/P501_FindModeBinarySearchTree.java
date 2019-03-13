package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/find-mode-in-binary-search-tree/
//Runtime: 6 ms, faster than 53.76% of Java online submissions for Find Mode in Binary Search Tree.

public class P501_FindModeBinarySearchTree {
	private int p(TreeNode node, Map<Integer, Integer>map) {
		if (node == null) return Integer.MIN_VALUE;
		int count = map.getOrDefault(node.val, 0);
		map.put(node.val, count+1);
		int i1 = p(node.left, map);
		int i2 = p(node.right, map);
		return Math.max(count+1, Math.max(i1, i2));
	}
	
	public int[] findMode(TreeNode root) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = p(root, map);
		List<Integer> l = new ArrayList<Integer>();
		for (int k : map.keySet()) {
			int v = map.get(k);
			if (v == max) {
				l.add(k);
			}
		}
		int r[] = new int[l.size()];
		for (int i = 0; i < l.size(); i++) {
			r[i] = l.get(i);
		}
		return r;
    }
}
