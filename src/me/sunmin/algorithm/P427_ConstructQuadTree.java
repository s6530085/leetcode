package me.sunmin.algorithm;

//https://leetcode.com/problems/construct-quad-tree/description/
//Runtime: 2 ms, faster than 60.54% of Java online submissions for Construct Quad Tree.

public class P427_ConstructQuadTree {

	class Node {
	    public boolean val;
	    public boolean isLeaf;
	    public Node topLeft;
	    public Node topRight;
	    public Node bottomLeft;
	    public Node bottomRight;

	    public Node() {}

	    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
	        val = _val;
	        isLeaf = _isLeaf;
	        topLeft = _topLeft;
	        topRight = _topRight;
	        bottomLeft = _bottomLeft;
	        bottomRight = _bottomRight;
	    }
	};
	
	private Node nodeFromNodes(Node[] nodes) {
		boolean canMerge = true;
		for (int i = 0; i < 4; i ++) {
			if (!nodes[i].isLeaf) {
				canMerge = false;
				break;
			}
			if (i < 3) {
				if (nodes[i].val != nodes[i+1].val) {
					canMerge = false;
					break;
				}
			}
		}
		if (canMerge) {
			return new Node(nodes[0].val, true, null, null, null, null);
		}
		else {
			return new Node(false, false, nodes[0], nodes[1], nodes[2], nodes[3]);
		}
	}
	
	public Node construct(int[][] grid) {
        Node[] nodes = fourNode(grid, 0, 0, grid.length);
        return nodeFromNodes(nodes);
    }
	
	private Node[] fourNode(int[][] grid, int i, int j, int n) {
		if (n == 2) {
			return new Node[] {
					new Node(grid[i][j]==1, true, null, null, null, null),
					new Node(grid[i][j+1]==1, true, null, null, null, null),
					new Node(grid[i+1][j]==1, true, null, null, null, null),
					new Node(grid[i+1][j+1]==1, true, null, null, null, null)
			};
		}
		else {
			return new Node[] {
					nodeFromNodes(fourNode(grid, i, j, n/2)),
					nodeFromNodes(fourNode(grid, i, j+n/2, n/2)),
					nodeFromNodes(fourNode(grid, i+n/2, j, n/2)),
					nodeFromNodes(fourNode(grid, i+n/2, j+n/2, n/2))
			};
		}
	}
}
