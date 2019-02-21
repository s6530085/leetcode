package me.sunmin.algorithm;
//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
//Runtime: 1 ms, faster than 97.98% of Java online submissions for Binary Tree Level Order Traversal II.


import java.util.ArrayList;
import java.util.List;

public class P107_BinaryTreeLevelOrderTraversal2 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
			list.add(0, il);
			l = nl;
		}
		return list;
    }
}
