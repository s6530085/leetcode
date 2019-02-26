package me.sunmin.algorithm;
//https://leetcode.com/problems/sum-root-to-leaf-numbers/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum Root to Leaf Numbers.


public class P129_SumRootLeafNumbers {
	
	public int p(TreeNode node, int base) {
		if (node == null) return 0;
		base = base * 10 + node.val;
		if (node.left == null && node.right == null) {
			return base;
		}
		else {
			return p(node.left, base) + p(node.right, base);
		}
	}
	
	public int sumNumbers(TreeNode root) {
		return p(root, 0);
    }
}
