package me.sunmin.algorithm;
//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.

public class P108_ConvertSortedArrayToBinarySearchTree {
	private TreeNode p(int nums[], int i, int j) {
		if (i >= j) return null;
		int middle = i + ((j - i) >> 1);
		TreeNode node = new TreeNode(nums[middle]);
		node.left = p(nums, i, middle);
		node.right = p(nums, middle+1, j);
		return node;
	}
	
	public TreeNode sortedArrayToBST(int[] nums) {
        return p(nums, 0, nums.length);
    }
}
