package me.sunmin.algorithm;
//https://leetcode.com/problems/maximum-depth-of-binary-tree/
//Runtime: 2 ms, faster than 10.50% of Java online submissions for Maximum Depth of Binary Tree.
//todosm

import java.util.ArrayList;
import java.util.List;

public class P104_MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
        if (root == null) return 0;
		int depth = 0;
		List<TreeNode> l = new ArrayList<TreeNode>();
		l.add(root);
		while (l.size() > 0) {
			depth++;
			List<TreeNode> n = new ArrayList<TreeNode>();
			for (TreeNode node : l) {
				if (node.left != null) n.add(node.left);
				if (node.right != null) n.add(node.right);
			} 
			l = n;
		}
		return depth;

   }
}
