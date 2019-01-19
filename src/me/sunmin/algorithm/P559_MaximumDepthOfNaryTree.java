package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
//Runtime: 9 ms, faster than 11.70% of Java online submissions for Maximum Depth of N-ary Tree.
//todosm

public class P559_MaximumDepthOfNaryTree {
	public int maxDepth(Node root) {
        if (root == null) return 0;
        int depth = 0;
        List<Node> lastNodes = new ArrayList<Node>();
        lastNodes.add(root);
        while(lastNodes.size() > 0) {
            List<Node> currentNodes = new ArrayList<Node>();
            for (Node n : lastNodes) {
                for (Node c : n.children) {
                    currentNodes.add(c);
                }
            }
        lastNodes = currentNodes;
        depth++;
        }
        return depth;
    }
}
