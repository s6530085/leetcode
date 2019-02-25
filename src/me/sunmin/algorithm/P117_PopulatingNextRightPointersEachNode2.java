package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
//Runtime: 2 ms, faster than 36.14% of Java online submissions for Populating Next Right Pointers in Each Node II.
//todosm

public class P117_PopulatingNextRightPointersEachNode2 {
	class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node next;

	    public Node() {}

	    public Node(int _val,Node _left,Node _right,Node _next) {
	        val = _val;
	        left = _left;
	        right = _right;
	        next = _next;
	    }
	};
	
	public Node connect(Node root) {
		if (root == null) return null;
		List<Node> l = new ArrayList<Node>();
		if (root != null) l.add(root);
		while(!l.isEmpty()) {
			List<Node> nl = new ArrayList<Node>();
			for (int i = 0; i < l.size(); i++) {
				Node n = l.get(i);
				if (n.left!=null) {
					nl.add(n.left);
				}
				if (n.right!=null) {
					nl.add(n.right);
				}
				if (i < l.size()-1) {
					n.next = l.get(i+1);
				}
			}
			l = nl;
		}
        return root;
    }

}
