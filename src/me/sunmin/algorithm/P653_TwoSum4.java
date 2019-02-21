package me.sunmin.algorithm;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
//Runtime: 14 ms, faster than 84.28% of Java online submissions for Two Sum IV - Input is a BST.


public class P653_TwoSum4 {

	private boolean p(TreeNode node, int k, Set<Integer>set) {
		if (node == null) return false;
		if (set.contains(k-node.val)) {
			return true;
		}
		set.add(node.val);
		return p(node.left, k, set) || p(node.right, k, set);
	}
	
	public boolean findTarget(TreeNode root, int k) {
		Set<Integer> set = new HashSet<Integer>();
		return p(root, k, set);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
