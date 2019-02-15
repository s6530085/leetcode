package me.sunmin.algorithm;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.


public class P083_RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) return null;
		if (head.next == null) return head;
		
		ListNode prev = head;
		ListNode current = head;
		while(current != null) {
			if (current.val != prev.val) {
				prev.next = current;
				prev = current;
				current = current.next;
			}
			else {
				current = current.next;
				if (current == null) {
					prev.next = null;
					break;
				}
			}
		}
		
		return head;
    }
}
