package me.sunmin.algorithm;
//https://leetcode.com/problems/n-ary-tree-level-order-traversal/
//Runtime: 5 ms, faster than 74.00% of Java online submissions for N-ary Tree Level Order Traversal.

import java.util.ArrayList;
import java.util.List;

public class P429_NaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (root != null) {
        	List<Node> l = new ArrayList<Node>();
        	l.add(root);
        	while(!l.isEmpty()) {
        		List<Integer> li = new ArrayList<Integer>();
        		List<Node> nl = new ArrayList<Node>();
        		for (Node n : l) {
        			li.add(n.val);
        			for (Node c : n.children) {
        				nl.add(c);
        			}
        		}
        		list.add(li);
        		l = nl;
        	}
        }        
        return list;
    }
}
