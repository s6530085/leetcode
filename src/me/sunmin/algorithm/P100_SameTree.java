package me.sunmin.algorithm;

//https://leetcode.com/problems/same-tree/
//Runtime: 2 ms, faster than 100.00% of Java online submissions for Same Tree.


public class P100_SameTree {
	
	private boolean p(TreeNode p, TreeNode q) {
		if (p == null && q == null) return true;
		if (p != null && q != null) {
			if (p.val == q.val) {
				return p(p.left, q.left) && p(p.right, q.right);
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		return p(p, q);
    }
}
