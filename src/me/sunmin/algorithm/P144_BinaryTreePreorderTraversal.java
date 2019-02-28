package me.sunmin.algorithm;
//https://leetcode.com/problems/binary-tree-preorder-traversal/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Preorder Traversal.

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P144_BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root != null) {
            Stack<TreeNode> stack = new Stack<TreeNode>();
            TreeNode current = root;
            while(!stack.isEmpty() || current != null) {
            	if (current!=null) {
            		stack.push(current);
            		list.add(current.val);
            		current = current.left;
            	}
            	else {
        			current = stack.pop().right;
        		}
            }
        }
        
        return list;
    }
}
