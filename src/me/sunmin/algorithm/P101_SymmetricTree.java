package me.sunmin.algorithm;
//https://leetcode.com/problems/symmetric-tree/
//Runtime: 6 ms, faster than 94.98% of Java online submissions for Symmetric Tree.

public class P101_SymmetricTree {

	private boolean p(TreeNode l, TreeNode r) {
		if (l == null && r == null) return true;
		else if (l != null && r != null ) {
			if (l.val == r.val) {
				return p(l.left, r.right) && p(l.right, r.left);
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public boolean isSymmetric(TreeNode root) {
		if (root == null) return true;
		return p(root.left, root.right);
	}
}
