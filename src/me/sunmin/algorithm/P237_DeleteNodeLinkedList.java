package me.sunmin.algorithm;
//https://leetcode.com/problems/delete-node-in-a-linked-list/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
//category:link

public class P237_DeleteNodeLinkedList {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
    }
}
