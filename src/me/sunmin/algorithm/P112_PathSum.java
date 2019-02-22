package me.sunmin.algorithm;
//https://leetcode.com/problems/path-sum/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.


public class P112_PathSum {
	
	public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && root.val == sum) {
        	return true;
        }
        else {
        	return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
        }
    }
}
