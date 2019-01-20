package me.sunmin.algorithm;
//https://leetcode.com/problems/trim-a-binary-search-tree/
//Runtime: 4 ms, faster than 98.89% of Java online submissions for Trim a Binary Search Tree.

public class P669_TrimBinarySearchTree {
	private static TreeNode _root;
	private void p_trimBST(TreeNode node, int L, int R, TreeNode parent, boolean fromLeft) {
		if (node == null)	return;
		if (node.val >= L && node.val <= R) {
			if (_root == null) _root = node;
			p_trimBST(node.left, L, R, node, true);
			p_trimBST(node.right, L, R, node, false);
		}
		else {
			if (node.val < L) {
				node.left = null;
				if (parent != null) {
					if (fromLeft) {
						parent.left = node.right;
					}
					else {
						parent.right = node.right;
					}
				}
				p_trimBST(node.right, L, R, parent, fromLeft);
			}
			else {
				node.right = null;
				if (parent != null) {
					if (fromLeft) {
						parent.left = node.left;
					}
					else {
						parent.right = node.left;
					}
				}
				p_trimBST(node.left, L, R, parent, fromLeft);
			}
		}
	}

	public TreeNode trimBST(TreeNode root, int L, int R) {
		_root = null;
		p_trimBST(root, L, R, null, true);
		return _root;
	}
}
