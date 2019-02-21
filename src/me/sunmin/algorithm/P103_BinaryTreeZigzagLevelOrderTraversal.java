package me.sunmin.algorithm;
//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
//Runtime: 1 ms, faster than 89.59% of Java online submissions for Binary Tree Zigzag Level Order Traversal.

import java.util.ArrayList;
import java.util.List;

public class P103_BinaryTreeZigzagLevelOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>>list = new ArrayList<List<Integer>>();
		List<TreeNode> l = new ArrayList<TreeNode>();
		if (root != null) l.add(root);
		boolean leftToRight = false;
		while(!l.isEmpty()) {
			List<TreeNode> nl = new ArrayList<TreeNode>();
			List<Integer> il = new ArrayList<Integer>();
			for (int i = 0; i < l.size(); i++) {
				TreeNode n = l.get(i);
				if (leftToRight) {
					il.add(n.val);
				}
				else {
					il.add(il.size(), n.val);
				}
				if (n.left!=null) {
					nl.add(n.left);
				}
				if (n.right!=null) {
					nl.add(n.right);
				}
			}
			leftToRight = !leftToRight;
			list.add(il);
			l = nl;
		}
		return list;
    }
}
