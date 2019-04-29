package me.sunmin.algorithm;
//https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
//Runtime: 1 ms, faster than 82.07% of Java online submissions for Construct Binary Search Tree from Preorder Traversal.

public class P1008_ConstructBinarySearchTreePreorderTraversal {
	private TreeNode p(int[] preorder, int begin, int end) {
		if (begin < end) {
			TreeNode n = new TreeNode(preorder[begin]);
			int l = begin+1;
			while (l < preorder.length && preorder[l] < preorder[begin]) {
				l++;
			}
			n.left = p(preorder, begin+1, l);
			n.right = p(preorder, l, end);
			return n;
		}
		else {
			return null;
		}
	}
	
	public TreeNode bstFromPreorder(int[] preorder) {
        return p(preorder, 0, preorder.length);
    }
}
