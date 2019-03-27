package me.sunmin.algorithm;
//https://leetcode.com/problems/subtree-of-another-tree/
//Runtime: 6 ms, faster than 98.87% of Java online submissions for Subtree of Another Tree.

public class P572_SubtreeAnotherTree {
	
	private boolean pp(TreeNode s, TreeNode t) {
		if (s == null && t == null) return true;
		if (s != null && t != null) {
			if (s.val == t.val) {
				return pp(s.left, t.left) && pp(s.right, t.right);
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	private boolean p(TreeNode s, TreeNode t) {
		if (s == null) return false;
		if (pp(s, t)) return true;
		else return p(s.left, t) || p(s.right, t);
	}
	
	public boolean isSubtree(TreeNode s, TreeNode t) {
		return p(s, t);
    }
	
}
