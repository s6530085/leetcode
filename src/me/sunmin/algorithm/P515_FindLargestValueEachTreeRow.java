package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-largest-value-in-each-tree-row/
//Runtime: 4 ms, faster than 95.47% of Java online submissions for Find Largest Value in Each Tree Row.

public class P515_FindLargestValueEachTreeRow {
	public List<Integer> largestValues(TreeNode root) {
		List<Integer>il = new ArrayList<Integer>();
		List<TreeNode> l = new ArrayList<TreeNode>();
		if (root != null) l.add(root);
			while(!l.isEmpty()) {
				List<TreeNode> nl = new ArrayList<TreeNode>();
				int max = Integer.MIN_VALUE;
				for (int i = 0; i < l.size(); i++) {
					TreeNode n = l.get(i);
					if (n.val > max) max = n.val;
					if (n.left!=null) {
						nl.add(n.left);
					}
					if (n.right!=null) {
						nl.add(n.right);
					}
				}
				il.add(max);
				l = nl;
			}
		 
		 return il;
	 }
}
