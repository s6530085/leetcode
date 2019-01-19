package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/n-ary-tree-postorder-traversal/
//Runtime: 5 ms, faster than 81.64% of Java online submissions for N-ary Tree Postorder Traversal.


public class P590_NaryTreePostorderTraversal {
	private void recu(Node node, List<Integer> l) {
        for (Node child : node.children) {
            recu(child, l);
        }
        l.add(node.val);
    }
    
    public List<Integer> postorder(Node root) {
        List<Integer>result = new ArrayList<Integer>();
        if (root == null) return result;
        recu(root, result);
        return result;
    }
}
