package me.sunmin.algorithm;
//https://leetcode.com/problems/binary-tree-pruning/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Binary Tree Pruning.

public class P814_BinaryTreePruning {
	
	private boolean allZero(TreeNode node) {
		if (node == null) return true;
		if (node.val == 1) return false;
		else {
			return allZero(node.left) && allZero(node.right);
		}
	}
	
	private void p(TreeNode node) {
		if (node == null) return;
		if (allZero(node.left)) node.left = null;
		else p(node.left);
		if (allZero(node.right)) node.right = null;
		else p(node.right);
	}
	
	public TreeNode pruneTree(TreeNode root) {
		if (allZero(root)) return null;
		else p(root);
		return root;
    }
}
