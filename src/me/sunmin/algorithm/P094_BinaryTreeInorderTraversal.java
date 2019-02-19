package me.sunmin.algorithm;
//https://leetcode.com/problems/binary-tree-inorder-traversal/
//Runtime: 1 ms, faster than 55.50% of Java online submissions for Binary Tree Inorder Traversal.

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P094_BinaryTreeInorderTraversal {
	
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer>list = new ArrayList<Integer>();
		Stack<TreeNode>stack = new Stack<TreeNode>();
		TreeNode current = root;
		while(!stack.isEmpty() || current != null) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			}
			else {
				TreeNode node = stack.pop();
				list.add(node.val);
				current = node.right;
			}
		}
		return list;
    }
}
