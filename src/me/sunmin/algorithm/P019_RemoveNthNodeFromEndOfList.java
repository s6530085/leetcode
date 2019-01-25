package me.sunmin.algorithm;
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//Runtime: 6 ms, faster than 98.75% of Java online submissions for Remove Nth Node From End of List.

public class P019_RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
		ListNode nth = null;
		ListNode nthprev = null;
		if (n == 1) {
			nth = head;
		}
		int step = 1;
		while (current.next != null) {
			step++;
			if (step == n) {
				nth = head;
			}
			else if (step > n) {
				nthprev = nth;
				nth = nth.next;
			}
			current = current.next;
		}
		if (nthprev == null) {
			return nth.next;
		}
		else {
			nthprev.next = nth.next;
		}
		return head;

    }
}
