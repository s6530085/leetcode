package me.sunmin.algorithm;
//https://leetcode.com/problems/odd-even-linked-list/
//Runtime: 2 ms, faster than 100.00% of Java online submissions for Odd Even Linked List.

public class P328_OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
		if (head == null || head.next == null || head.next.next == null) return head;
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead= even;
		while (even.next != null && even.next.next != null) {
			ListNode lastOdd = odd;
			odd = even.next;
			even = odd.next;
			
			lastOdd.next = odd;
			lastOdd.next.next = even;
		}
		if (even.next == null) {
			odd.next = evenHead;
		}
		else {
			odd.next = even.next;
			even.next = null;
			odd.next.next = evenHead;
		}
		
		return head;
    }
}
