package me.sunmin.algorithm;
//https://leetcode.com/problems/delete-node-in-a-bst/
//Runtime: 3 ms, faster than 98.78% of Java online submissions for Delete Node in a BST.
//category:tree
public class P450_DeleteNodeInBST {
	
	public TreeNode deleteNode(TreeNode root, int key) {
        
		TreeNode parent = null;
        TreeNode current = root;
        TreeNode realHead = root;
        while(current != null) {
        	if (current.val == key) {
        		if (parent != null) {
        			boolean isLeft = parent.val > current.val;
        			if (current.left != null) {
        				TreeNode leftBiggest = current.left;
        				TreeNode leftBiggestParent = current;
        				while(leftBiggest.right != null) {
        					leftBiggestParent = leftBiggest;
        					leftBiggest = leftBiggest.right;
        				}
        				if (leftBiggestParent != current) {
        					leftBiggestParent.right = leftBiggest.left;
            				leftBiggest.left = current.left;
        				}
        				leftBiggest.right = current.right;
        				if (isLeft) {
        					parent.left = leftBiggest;
        				}
        				else {
        					parent.right = leftBiggest;
        				}
        			}
        			else if (current.right != null) {
        				TreeNode rightSmallest = current.right;
        				TreeNode rightSmallestParent = current;
        				while (rightSmallest.left != null) {
        					rightSmallestParent = rightSmallest;
        					rightSmallest = rightSmallest.left;
        				}
        				if (rightSmallestParent != current) {
        					rightSmallestParent.left = rightSmallest.right;
        					rightSmallest.right = current.right;
        				}
        				rightSmallest.left = current.left;
        				if (isLeft) {
        					parent.left = rightSmallest;
        				}
        				else {
        					parent.right = rightSmallest;
        				}
        			}
        			else {
        				if (isLeft) {
        					parent.left = null;
        				}
        				else {
        					 parent.right = null;
        				}
        			}
        		}
        		else {
        			if (current.left != null) {
        				TreeNode leftBiggest = current.left;
        				TreeNode leftBiggestParent = current;
        				while(leftBiggest.right != null) {
        					leftBiggestParent = leftBiggest;
        					leftBiggest = leftBiggest.right;
        				}
        				if (leftBiggestParent != current) {
        					leftBiggestParent.right = leftBiggest.left;
            				leftBiggest.left = current.left;
        				}
        				leftBiggest.right = current.right;
        				realHead = leftBiggest;
        			}
        			else if (current.right != null) {
        				TreeNode rightSmallest = current.right;
        				TreeNode rightSmallestParent = current;
        				while (rightSmallest.left != null) {
        					rightSmallestParent = rightSmallest;
        					rightSmallest = rightSmallest.left;
        				}
        				if (rightSmallestParent != current) {
        					rightSmallestParent.left = rightSmallest.right;
        					rightSmallest.right = current.right;
        				}
        				rightSmallest.left = current.left;
        				realHead = rightSmallest;
        			}
        			else {
        				realHead = null;
        			}
        		}
    			break;
        	}
        	parent = current;
        	current = current.val > key ? current.left : current.right; 
        }
        
        return realHead;
    }
}
