package me.sunmin.algorithm;
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Populating Next Right Pointers in Each Node.

public class P116_PopulatingNextRightPointersEachNode {
	
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
	
	private void p(Node node, Node toRight) {
		if (node ==null) return;
		node.next = toRight;
		p(node.left, node.right);
		if (toRight != null) {
			p(node.right, toRight.left);
		}
		else {
			p(node.right, null);
		}
	}
	
	public Node connect(Node root) {
		if (root == null) return null;
        p(root, null);
        return root;
    }
}
