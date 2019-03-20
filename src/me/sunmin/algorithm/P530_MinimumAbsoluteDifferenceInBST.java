package me.sunmin.algorithm;
//https://leetcode.com/problems/minimum-absolute-difference-in-bst/
//Runtime: 5 ms, faster than 100.00% of Java online submissions for Minimum Absolute Difference in BST.
//category:tree

public class P530_MinimumAbsoluteDifferenceInBST {
	
	private TreeNode leftBiggest(TreeNode node) {
		if (node == null || node.left == null) return null;
		TreeNode current = node.left;
		while (current.right != null) {
			current = current.right;
		}
		return current;
	}
	
	private TreeNode rightSmallest(TreeNode node) {
		if (node == null || node.right == null) return null;
		TreeNode current = node.right;
		while(current.left != null) {
			current = current.left;
		}
		return current;
	}
	
	private void p(TreeNode node) {
		if (node == null) return;
		TreeNode left = leftBiggest(node);
		if (left != null) {
			min = Math.min(min, Math.abs(node.val - left.val));
		}
		TreeNode right = rightSmallest(node);
		if (right != null) {
			min = Math.min(min, Math.abs(node.val-right.val));
		}
		p(node.left);
		p(node.right);
	}
	
	
	private int min;
	public int getMinimumDifference(TreeNode root) {
		min = Integer.MAX_VALUE;
		p(root);
		return min;
    }
	
	
}
