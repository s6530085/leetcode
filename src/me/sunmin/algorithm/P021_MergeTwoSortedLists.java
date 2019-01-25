package me.sunmin.algorithm;
//https://leetcode.com/problems/merge-two-sorted-lists/
//Runtime: 6 ms, faster than 99.77% of Java online submissions for Merge Two Sorted Lists.

public class P021_MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
		if (l2 == null) return l1;
		if (l1 == null && l2 == null) return null;
		ListNode head = l1.val < l2.val ? l1 : l2;
		ListNode current = null;
		while(l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				if (current == null) {
					current = l1;
				}
				else {
					current.next = l1;
					current = l1;
				}
				l1 = l1.next;
			}
			else {
				if (current == null) {
					current = l2;
				}
				else {
					current.next = l2;
					current = l2;
				}
				l2 = l2.next;
			}
		}
		
		if (l1 == null) {
			current.next = l2;
		}
		else {
			current.next = l1;
		}
		
		return head;

    }
}
