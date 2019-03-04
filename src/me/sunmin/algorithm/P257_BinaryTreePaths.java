package me.sunmin.algorithm;
//https://leetcode.com/problems/binary-tree-paths/
//Runtime: 6 ms, faster than 100.00% of Java online submissions for Binary Tree Paths.

import java.util.ArrayList;
import java.util.List;

public class P257_BinaryTreePaths {
	
	private void p(TreeNode node, String path, List<String> list) {
		if (path.equals("")) {
			path = "" + node.val;
		}
		else {
			path += "->"  + node.val;
		}
		
		if (node.left == null && node.right == null) {	
			list.add(path);
		}
		if (node.left != null) {
			p(node.left, path, list);
		}
		if (node.right != null) {
			p(node.right, path, list);
		}
	}
	
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<String>();
		if (root != null) {
			p(root, "", list);
		}
		return list;
    }
}
