package me.sunmin.algorithm;
//https://leetcode.com/problems/path-sum-iii/
//Runtime: 16 ms, faster than 59.81% of Java online submissions for Path Sum III.
//category:tree

public class P437_PathSum3 {
	
	private int count;
	
	private void pp(TreeNode root, int sum) {
		if (root == null) return;
		if (root.val - sum == 0) count++;
		pp(root.left, sum-root.val);
		pp(root.right, sum-root.val);
	}
	
	private void p(TreeNode root, int sum) {
		if (root == null) return;
		pp(root, sum);
		p(root.left, sum);
		p(root.right, sum);
	}
	
	public int pathSum(TreeNode root, int sum) {
		count = 0;
		p(root, sum);
		return count;
    }
	
	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		n1.right = n2;
		n2.right =n3;
		n3.right =n4;
		n4.right =n5;
		P437_PathSum3 s= new P437_PathSum3();
		s.pathSum(n1, 3);
	}
}