package me.sunmin.algorithm;
//https://leetcode.com/problems/sum-of-left-leaves/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Sum of Left Leaves.

public class P404_SumLeftLeaves {
	
	private int p(TreeNode root, boolean isLeft) {
		if (root == null) return 0;
		if (root.left == null && root.right == null && isLeft) {
			return root.val;
		}
		else {
			int left = root.left == null ? 0 : p(root.left, true);
			int right = root.right == null ? 0 : p(root.right, false);
			return left + right;
		}
	}
	
	public int sumOfLeftLeaves(TreeNode root) {
        return p(root, false);
    }
}
