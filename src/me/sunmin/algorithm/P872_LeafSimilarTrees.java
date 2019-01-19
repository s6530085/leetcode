package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/leaf-similar-trees/
//Runtime: 4 ms, faster than 77.89% of Java online submissions for Leaf-Similar Trees.


public class P872_LeafSimilarTrees {
	private void visitTree(TreeNode node, List<Integer> vl) {
		if (node == null)	return;
		
		visitTree(node.left, vl);
		visitTree(node.right, vl);
		if (node.left == null && node.right == null) {
			vl.add(node.val);
		}
	}
	
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		List<Integer>vl1 = new ArrayList<Integer>();
		List<Integer>vl2 = new ArrayList<Integer>();
		visitTree(root1, vl1);
		visitTree(root2, vl2);
		return vl1.equals(vl2);
	}

}
