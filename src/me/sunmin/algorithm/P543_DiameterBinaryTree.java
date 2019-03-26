package me.sunmin.algorithm;
//https://leetcode.com/problems/diameter-of-binary-tree/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Diameter of Binary Tree.
//category:tree

import java.util.HashMap;
import java.util.Map;

public class P543_DiameterBinaryTree {
	
	private Map<TreeNode, Integer> map = new HashMap<TreeNode, Integer>();
	private int ppp(TreeNode node) {
		if (node == null) return 0;
		Integer i = map.get(node);
		if (i == null) {
			i = 1 + Math.max(ppp(node.left), ppp(node.right));
			map.put(node, i);
		}
		return i;
	}
	
	private int pp(TreeNode node ) {
		if (node == null) return 0;
		return ppp(node.left) + ppp(node.right);
	}
	
	private void p(TreeNode node) {
		if (node == null) return;
		int v = pp(node);
		if (v > max) {
			max = v;
		}
		p(node.left);
		p(node.right);
	}
	
	private static int max = Integer.MIN_VALUE;
	public int diameterOfBinaryTree(TreeNode root) {
		if (root == null) return 0;
		max = Integer.MIN_VALUE;
        p(root);
        return max;
    }
	
}
