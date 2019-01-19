package me.sunmin.algorithm;
//https://leetcode.com/problems/flip-equivalent-binary-trees/
//Runtime: 4 ms, faster than 97.76% of Java online submissions for Flip Equivalent Binary Trees.

public class P951_FlipEquivalentBinaryTrees {
	public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
			return true;
		}
		else if (root1 != null && root2 != null && root1.val == root2.val) {
			return (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left)) 
					|| (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right));
		}
		else {
			return false;
		}

    }
}
