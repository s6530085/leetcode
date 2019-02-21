package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-level-order-traversal/
//Runtime: 1 ms, faster than 85.87% of Java online submissions for Binary Tree Level Order Traversal.


public class P102_BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>>list = new ArrayList<List<Integer>>();
		List<TreeNode> l = new ArrayList<TreeNode>();
		if (root != null) l.add(root);
		while(!l.isEmpty()) {
			List<TreeNode> nl = new ArrayList<TreeNode>();
			List<Integer> il = new ArrayList<Integer>();
			for (int i = 0; i < l.size(); i++) {
				TreeNode n = l.get(i);
				il.add(n.val);
				if (n.left!=null) {
					nl.add(n.left);
				}
				if (n.right!=null) {
					nl.add(n.right);
				}
			}
			list.add(il);
			l = nl;
		}
		return list;
    }
}
