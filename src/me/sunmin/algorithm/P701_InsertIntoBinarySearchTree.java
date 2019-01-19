package me.sunmin.algorithm;
//Runtime: 4 ms, faster than 55.06% of Java online submissions for Insert into a Binary Search Tree.

public class P701_InsertIntoBinarySearchTree {
	public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;
		while(true) {
			if (val < node.val) {
				if (node.left == null) {
					node.left = new TreeNode(val);
					break;
				}
				else {
					node = node.left;
				}
			}
			else {
				if (node.right == null) {
					node.right = new TreeNode(val);
					break;
				}
				else {
					node = node.right;
				}
			}
		}
		
		return root;

    }
}
