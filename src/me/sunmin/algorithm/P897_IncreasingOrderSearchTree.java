package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/increasing-order-search-tree/
//Runtime: 53 ms, faster than 53.74% of Java online submissions for Increasing Order Search Tree.

public class P897_IncreasingOrderSearchTree {
	private void recu(TreeNode node, List<Integer> l) {
		if (node == null) 	return;
		recu(node.left, l);
		l.add(node.val);
		recu(node.right, l);
	}
	
	public TreeNode increasingBST(TreeNode root) {
		List<Integer> l = new ArrayList<Integer>();
		recu(root, l);

		TreeNode n = new TreeNode(l.get(0));
		TreeNode lastNode = n;
		for (int i = 1; i < l.size(); i++) {
			TreeNode no = new TreeNode(l.get(i));
			lastNode.right = no;
			lastNode = no;
		}
		return n;
	}
}
