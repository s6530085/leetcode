package me.sunmin.algorithm;
//https://leetcode.com/problems/average-of-levels-in-binary-tree/
//Runtime: 5 ms, faster than 91.22% of Java online submissions for Average of Levels in Binary Tree.

import java.util.ArrayList;
import java.util.List;

public class P637_AverageLevelsBinaryTree {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> list = new ArrayList<Double>();
        if (root != null) {
        	List<TreeNode> l = new ArrayList<TreeNode>();
        	l.add(root);
        	while(!l.isEmpty()) {
        		double d = 0;
        		int count = 0;
        		List<TreeNode> nl = new ArrayList<TreeNode>();
        		for (TreeNode n : l) {
        			d += n.val;
        			count++;
        			if (n.left != null) {
        				nl.add(n.left);
        			}
        			if (n.right != null) {
        				nl.add(n.right);
        			}
        		}
        		list.add(d/count);
        		l = nl;
        	}
        }        
        return list;
    }
}
