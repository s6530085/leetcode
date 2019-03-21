package me.sunmin.algorithm;
//https://leetcode.com/problems/construct-string-from-binary-tree/
//Runtime: 11 ms, faster than 65.28% of Java online submissions for Construct String from Binary Tree.
//category:tree

public class P606_ConstructStringBinaryTree {
	
	public String tree2str(TreeNode t) {
		if (t == null) return "";
		String s = "" + t.val;
        if (t.left != null || t.right != null) {
            if (t.right == null) {
                s += "(" + tree2str(t.left) + ")";
            }
            else {
                s += "(" + tree2str(t.left) + ")" + "(" + tree2str(t.right) + ")";
            }
        }
		return s;	
	}
	
	
}
