package me.sunmin.algorithm;

//https://leetcode.com/problems/balanced-binary-tree/
//Runtime: 1 ms, faster than 93.84% of Java online submissions for Balanced Binary Tree.


public class P110_BalancedBinaryTree {
	
	private int h(TreeNode node) {
		if (node == null) return 0;
		return 1 + Math.max(h(node.left), h(node.right));
	}
	
	
	public boolean isBalanced(TreeNode root) {
		if (root == null) return true;
		int leftHeight = h(root.left);
		int rightHeight = h(root.right);
		if (Math.abs(leftHeight - rightHeight) > 1) {
			return false;
		}
		
		return isBalanced(root.left) && isBalanced(root.right);
    }
}
