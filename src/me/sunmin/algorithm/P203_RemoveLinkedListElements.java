package me.sunmin.algorithm;
//https://leetcode.com/problems/remove-linked-list-elements/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Remove Linked List Elements.


public class P203_RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) return null;
		ListNode current = head;
		ListNode realHead = head;
		ListNode last = null;
		while(current!=null) {
			if (current.val == val) {
				if (current == realHead) {
					realHead = current.next;
				}
				if (last != null) {
					last.next = current.next;
				}
				current = current.next;
			}
			else {
				if (current == head) {
					realHead = head;
				}
				last = current;
				current = current.next;
			}
			
		}
		
		return realHead;
    }
}
