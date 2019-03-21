package me.sunmin.algorithm;
//https://leetcode.com/problems/minimum-distance-between-bst-nodes/
//Runtime: 2 ms, faster than 95.96% of Java online submissions for Minimum Distance Between BST Nodes.
//category:tree

public class P783_MinimumDistanceBetweenBSTNodes {
	
	private TreeNode biggestLeft(TreeNode node) {
		if (node == null || node.left == null) return null;
		TreeNode n = node.left;
		while (n.right != null) {
			n = n.right;
		}
		return n;
	}
	
	private TreeNode smallestRight(TreeNode node) {
		if (node == null || node.right == null) return null;
		TreeNode n = node.right;
		while(n.left != null) {
			n = n.left;
		}
		return n;
	}
	
	private int min;
	public void p(TreeNode root) {
		if (root == null) return;
		TreeNode l = biggestLeft(root);
		TreeNode r = smallestRight(root);
		if (l != null) {
			min = Math.min(min, Math.abs(root.val-l.val));
		}
		if (r != null) {
			min = Math.min(min, Math.abs(root.val-r.val));
		}
		p(root.left);
		p(root.right);
	}
	
	
	public int minDiffInBST(TreeNode root) {
		min = Integer.MAX_VALUE;
		p(root);
		return min;
    }
	
}
