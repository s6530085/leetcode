package me.sunmin.algorithm;
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
//Runtime: 4 ms, faster than 100.00% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
//category:tree

public class P235_LowestCommonAncestorBinarySearchTree {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		while(root!=null) {
			if ((root.val >= p.val && root.val <= q.val) || (root.val <= p.val && root.val >= q.val
					)) {
				return root;
			}
			else if (root.val > p.val) {
				root = root.left;
			}
			else {
				root = root.right;
			}
		}
		return null;
    }
	
}
