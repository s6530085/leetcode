package me.sunmin.algorithm;
//https://leetcode.com/problems/range-sum-of-bst/
//Runtime: 21 ms, faster than 8.22% of Java online submissions for Range Sum of BST.

// todosm
import java.util.ArrayList;
import java.util.List;

public class P938_RangeSumOfBST {
	public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
		List<TreeNode> l = new ArrayList<TreeNode>();
		l.add(root);
		while(l.size() > 0) {
			List<TreeNode> nl = new ArrayList<TreeNode>();
			for (TreeNode n : l) {
				if (n.val >= L && n.val <= R) {
					sum += n.val;
				}
				if (n.left != null) {
					nl.add(n.left);
				}
				if (n.right != null) {
					nl.add(n.right);
				}
			}
			l = nl;
		}
		
		return sum;

    }
}
