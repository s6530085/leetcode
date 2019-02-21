package me.sunmin.algorithm;
//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
//Runtime: 6 ms, faster than 53.41% of Java online submissions for Construct Binary Tree from Inorder and Postorder Traversal.

public class P106_ConstructBinaryTreeFromInorderAndPostorderTraversal {

	private TreeNode p(int[] inorder, int i1, int j1, int[]postorder, int i2, int j2) {
		if (j2 <= i2) return null;
		int headValue = postorder[j2-1];
		TreeNode n = new TreeNode(headValue);
		for (int i = 0; i < j1; i++) {
			if (inorder[i] == headValue) {
				int leftCount = i - i1;
				n.left = p(inorder, i1, i, postorder, i2, i2 + leftCount);
				n.right = p(inorder, i+1, j1, postorder, i2 + leftCount, j2-1);
			}
		}
		return n;
	}
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		return p(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
