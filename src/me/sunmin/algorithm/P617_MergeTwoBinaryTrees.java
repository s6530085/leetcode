package me.sunmin.algorithm;
//https://leetcode.com/problems/merge-two-binary-trees/
//Runtime: 6 ms, faster than 74.19% of Java online submissions for Merge Two Binary Trees.
//category:tree

public class P617_MergeTwoBinaryTrees {
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) return null;
		TreeNode n = new TreeNode((t1!=null?t1.val:0)+(t2!=null?t2.val:0));
		n.left = mergeTrees((t1!=null?t1.left:null), (t2!=null?t2.left:null));
		n.right = mergeTrees((t1!=null?t1.right:null),(t2!=null?t2.right:null));
		return n;
    }
	
}
