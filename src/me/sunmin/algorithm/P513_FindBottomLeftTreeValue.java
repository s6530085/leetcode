package me.sunmin.algorithm;
//https://leetcode.com/problems/find-bottom-left-tree-value/
//Runtime: 4 ms, faster than 70.23% of Java online submissions for Find Bottom Left Tree Value.


import java.util.ArrayList;
import java.util.List;

public class P513_FindBottomLeftTreeValue {
	public int findBottomLeftValue(TreeNode root) {
		List<TreeNode> l = new ArrayList<TreeNode>();
		if (root != null) l.add(root);
		while(!l.isEmpty()) {
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
			if (!nl.isEmpty()) l = nl;
			else return l.get(0).val;
		}
		return 0;
    }
}
