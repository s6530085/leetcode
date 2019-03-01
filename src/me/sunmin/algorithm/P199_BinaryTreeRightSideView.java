package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-right-side-view/
//Runtime: 1 ms, faster than 78.99% of Java online submissions for Binary Tree Right Side View.


public class P199_BinaryTreeRightSideView {
	public List<Integer> rightSideView(TreeNode root) {
		
		List<Integer>list = new ArrayList<Integer>();
		List<TreeNode> l = new ArrayList<TreeNode>();
		if (root != null) l.add(root);
		while(!l.isEmpty()) {
			list.add(l.get(l.size()-1).val);
			List<TreeNode> nl = new ArrayList<TreeNode>();
			for (int i = 0; i < l.size(); i++) {
				TreeNode n = l.get(i);
				if (n.left!=null) {
					nl.add(n.left);
				}
				if (n.right!=null) {
					nl.add(n.right);
				}
			}
			l = nl;
		}
		return list;
    }
}
