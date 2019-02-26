package me.sunmin.algorithm;
//https://leetcode.com/problems/linked-list-cycle/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.

public class P141_LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		if (head == null) return false;
		if (head.next == null) return false;
		ListNode slow = head;
		ListNode fast = head.next;
		while (fast.next != null && fast.next.next != null) {
			if (fast == slow) {
				return true;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
    }
}
