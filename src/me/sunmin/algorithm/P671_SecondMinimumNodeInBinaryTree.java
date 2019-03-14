package me.sunmin.algorithm;
//https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Second Minimum Node In a Binary Tree.

import java.util.ArrayList;
import java.util.List;

public class P671_SecondMinimumNodeInBinaryTree {
	public int findSecondMinimumValue(TreeNode root) {
		List<TreeNode> l = new ArrayList<TreeNode>();
		if (root != null) l.add(root);
		int min = Integer.MAX_VALUE-1;
		int sec = Integer.MAX_VALUE;
		while(!l.isEmpty()) {
			List<TreeNode> nl = new ArrayList<TreeNode>();
			for (int i = 0; i < l.size(); i++) {
				TreeNode n = l.get(i);
				int v = n.val;
				if (v < min) {
					sec = min;
					min = v;
				}
				else if (v > min && v < sec) {
					sec = v;
				}
				if (n.left!=null) {
					nl.add(n.left);
				}
				if (n.right!=null) {
					nl.add(n.right);
				}
			}
			l = nl;
		}
		return sec == Integer.MAX_VALUE-1 ? -1 : sec;
	}
}
