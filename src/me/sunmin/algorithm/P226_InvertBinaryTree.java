package me.sunmin.algorithm;
//https://leetcode.com/problems/invert-binary-tree/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.

public class P226_InvertBinaryTree {
	
	private void p(TreeNode node) {
		if (node == null) return;
		TreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;
		p(node.left);
		p(node.right);
	}
	
	public TreeNode invertTree(TreeNode root) {
		if (root == null) return null;
		p(root);
		return root;
    }
}
