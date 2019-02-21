package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
//Runtime: 1 ms, faster than 99.17% of Java online submissions for Convert Sorted List to Binary Search Tree.

public class P109_ConvertSortedListToBinarySearchTree {
//	[-10,-3,0,5,9]
	public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);
        
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast.next != null && fast.next.next != null) {
        	slow = slow.next;
        	fast = fast.next.next;
        }
		
        ListNode middle = slow.next;
        TreeNode node = new TreeNode(middle.val);
        slow.next = null;
        ListNode middleNext = middle.next;
        middle.next = null;
        
        node.left = sortedListToBST(head);
        node.right = sortedListToBST(middleNext);
        
		return node;
    }
}
