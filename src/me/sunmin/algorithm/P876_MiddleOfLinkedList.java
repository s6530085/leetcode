package me.sunmin.algorithm;
//https://leetcode.com/problems/middle-of-the-linked-list/
//Runtime: 1 ms, faster than 98.47% of Java online submissions for Middle of the Linked List.

public class P876_MiddleOfLinkedList {
	public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
