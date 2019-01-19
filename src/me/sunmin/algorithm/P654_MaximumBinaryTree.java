package me.sunmin.algorithm;
//https://leetcode.com/problems/maximum-binary-tree/
//Runtime: 10 ms, faster than 98.57% of Java online submissions for Maximum Binary Tree.

public class P654_MaximumBinaryTree {
	private int findMaxIndex(int[] nums, int begin, int end) {
		int index = -1;
		int max = Integer.MIN_VALUE;
		for (int i = begin; i < end; i++) {
			if (nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}
		return index;
	}
	
	private TreeNode construct(int[] nums, int begin, int end) {
		if (begin >= end) {
			return null;
		}
		int index = findMaxIndex(nums, begin, end);
		TreeNode root = new TreeNode(nums[index]);
		root.left = construct(nums, begin, index);
		root.right = construct(nums, index+1, end);
		return root;
	}
	
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return construct(nums, 0, nums.length);
	}
}
