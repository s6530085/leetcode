package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/path-sum-ii/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Path Sum II.

public class P113_PathSum2 {
	
	private void p(TreeNode node, int sum, List<Integer>l, List<List<Integer>>list) {
		if (node == null) return;
		if (node.left == null && node.right == null) {
			if (node.val == sum) {
				l.add(node.val);
				list.add(l);
			}
		}
		else {
			int remain = sum-node.val;
			if (node.left != null && node.right != null) {
				List<Integer>ll = new ArrayList<Integer>(l);
				ll.add(node.val);
				p(node.left, remain, ll, list);
				
				List<Integer>rl = new ArrayList<Integer>(l);
				rl.add(node.val);
				p(node.right, remain, rl, list);
			}
			else {
				l.add(node.val);
				if (node.left != null) {
					p(node.left, remain, l, list);
				}
				else {
					p(node.right, remain, l, list);
				}
			}
		}
	}
	
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>>list = new ArrayList<List<Integer>>();
		p(root, sum, new ArrayList<Integer>(), list);
		return list;
    }
}
