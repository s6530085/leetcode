package me.sunmin.algorithm;
//https://leetcode.com/problems/univalued-binary-tree/
//Runtime: 5 ms, faster than 74.23% of Java online submissions for Univalued Binary Tree.


public class P965_UnivaluedBinaryTree {
	public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
			return true;
		}
		
		if (root.left != null && root.left.val != root.val) {
			return false;
		}
		if (root.right != null && root.right.val != root.val) {
			return false;
		}
		
		return isUnivalTree(root.left) && isUnivalTree(root.right);

    }
}
