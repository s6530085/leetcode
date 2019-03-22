package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/convert-bst-to-greater-tree/
//Runtime: 44 ms, faster than 5.01% of Java online submissions for Convert BST to Greater Tree.
//todosm category:tree

public class P538_ConvertBST2GreaterTree {
	
	private void pp(TreeNode node) {
		if (node == null) return;
		int i = Collections.binarySearch(list, node.val);
		int sum = 0;
		for (int j = i; j < list.size(); j++) {
			sum += list.get(j);
		}
		node.val = sum;
		p(node.left);
		p(node.right);
	}
	
	private void p(TreeNode node) {
		if (node == null) return;
		list.add(node.val);
		p(node.left);
		p(node.right);
	}
	
	private List<Integer> list = new ArrayList<Integer>();
	public TreeNode convertBST(TreeNode root) {
		list.clear();
		p(root);
		Collections.sort(list);
		pp(root);
		return root;
    }
	
}
