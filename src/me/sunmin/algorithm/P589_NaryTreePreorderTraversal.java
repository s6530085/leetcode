package me.sunmin.algorithm;
//https://leetcode.com/problems/n-ary-tree-preorder-traversal/
//Runtime: 4 ms, faster than 99.36% of Java online submissions for N-ary Tree Preorder Traversal.

import java.util.ArrayList;
import java.util.List;

public class P589_NaryTreePreorderTraversal {
	private void recu(Node node, List<Integer> l) {
        l.add(node.val);
        for (Node child : node.children) {
            recu(child, l);
        }
    }
    
    public List<Integer> preorder(Node root) {
        List<Integer>result = new ArrayList<Integer>();
        if (root == null) return result;
        recu(root, result);
        return result;
    }
}
