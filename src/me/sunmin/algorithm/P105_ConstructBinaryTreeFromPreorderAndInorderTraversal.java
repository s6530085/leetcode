package me.sunmin.algorithm;

import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
//Runtime: 9 ms, faster than 56.54% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.


public class P105_ConstructBinaryTreeFromPreorderAndInorderTraversal {

	private TreeNode p(int[] preorder, int i1, int j1, int[] inorder, int i2, int j2) {
		if (i1 >= j1) return null;
		TreeNode head = new TreeNode(preorder[i1]);
		for (int i = i2; i < j2; i++) {
			if (inorder[i] == preorder[i1]) {
				int leftCount = i - i2;
				head.left = i+1 >= i1+1+leftCount ? null : p(preorder, i1+1, i1+1+leftCount, inorder, i2, i);
				head.right = i1 + leftCount+1 >= j1 ? null : p(preorder, i1+leftCount+1, j1, inorder, i+1, j2);
			}
		}
		
		return head;
	}
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return p(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P105_ConstructBinaryTreeFromPreorderAndInorderTraversal t = new P105_ConstructBinaryTreeFromPreorderAndInorderTraversal();
		t.buildTree(new int[] {1, 2,3}, new int[] {3,2,1});
	}

}
