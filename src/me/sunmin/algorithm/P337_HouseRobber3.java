package me.sunmin.algorithm;
//https://leetcode.com/problems/house-robber-iii/
//Runtime: 638 ms, faster than 25.55% of Java online submissions for House Robber III.
//todosm category:dp

public class P337_HouseRobber3 {
	
	private int p(TreeNode node, boolean skip) {
		if (node == null) return 0;
		if (skip) {
			return p(node.left, false) + p(node.right, false);
		}
		else {
			return Math.max(node.val + p(node.left, true) + p(node.right, true), p(node.left, false) + p(node.right, false));
		}
	}
	
	public int rob(TreeNode root) {
		return p(root, false);
    }
}
