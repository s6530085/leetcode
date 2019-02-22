package me.sunmin.algorithm;
//https://leetcode.com/problems/minimum-depth-of-binary-tree/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Depth of Binary Tree.

public class P111_MinimumDepthBinaryTree {
	
	private int mh(TreeNode node) {
		if (node == null) return 0;
		if (node.left == null && node.right == null) {
			return 1;
		}
		else if (node.left != null && node.right != null) {
			return 1+Math.min(mh(node.left), mh(node.right));
		}
		else {
			if (node.left != null) return 1+ mh(node.left);
			if (node.right != null) return 1 + mh(node.right);
		}
		return 0;
	}
	
	public int minDepth(TreeNode root) {
        return mh(root);
    }
}
