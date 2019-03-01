package me.sunmin.algorithm;
//https://leetcode.com/problems/reverse-linked-list/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.

public class P206_ReverseLinkedList {
	
	
	private ListNode p(ListNode current, ListNode last) {
		ListNode temp = current.next;
		current.next = last;
		if (temp == null) {
			return current;
		}
		else {
			return p(temp, current);
		}
	}
	
	public ListNode reverseList(ListNode head) {
		if (head == null) return null;
		if (head.next == null) return head;
		
		return p(head, null);		
    }
	
}
