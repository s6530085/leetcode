package me.sunmin.algorithm;

public class L_Recursion_MaximumDepthBinaryTree {
	public int maxDepth(TreeNode root) {
		if (root == null) return 0;
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
