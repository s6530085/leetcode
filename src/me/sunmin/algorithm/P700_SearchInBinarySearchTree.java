package me.sunmin.algorithm;
//https://leetcode.com/problems/search-in-a-binary-search-tree/
//Runtime: 3 ms, faster than 98.54% of Java online submissions for Search in a Binary Search Tree.

public class P700_SearchInBinarySearchTree {
	public TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = root;
		while(node != null) {
			if (node.val == val) {
				return node;
			}
			else if (node.val > val) {
				node = node.left;
			}
			else {
				node = node.right;
			}
		}
		
		return node;

    }
}
