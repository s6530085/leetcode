package me.sunmin.algorithm;
//https://leetcode.com/problems/linked-list-cycle-ii/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle II.

public class P142_LinkedListCycle2 {
	public ListNode detectCycle(ListNode head) {
		if (head == null) return null;
		if (head.next == null) return null;
		ListNode slow = head;
		ListNode fast = head;
		boolean circle = false;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				circle = true;
				break;
			}
		}
		if (!circle) return null;
		slow = head;
		while (slow != fast) {
	       slow = slow.next;
	       fast = fast.next;
	   }
		return slow;
    }
}
