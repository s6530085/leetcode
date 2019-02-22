package me.sunmin.algorithm;
//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
//Runtime: 6 ms, faster than 100.00% of Java online submissions for Flatten Binary Tree to Linked List.

import java.util.ArrayList;
import java.util.List;

public class P114_FlattenBinaryTreeToLinkedList {
	
	private void p(TreeNode node,List<TreeNode>list) {
		if (node == null ) return;
		list.add(node);
		p(node.left, list);
		p(node.right, list);
	}
	
	public void flatten(TreeNode root) {
		if (root == null) return;
		List<TreeNode>list = new ArrayList<TreeNode>();
		p(root, list);
		TreeNode current = list.remove(0);
		current.left = null;
		for (TreeNode n : list) {
			current.right = n;
			current = n;
			current.left = null;
		}
		current.right = null;
    }
	
}
