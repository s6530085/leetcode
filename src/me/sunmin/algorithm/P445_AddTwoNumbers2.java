package me.sunmin.algorithm;
//https://leetcode.com/problems/add-two-numbers-ii/
//Runtime: 20 ms, faster than 96.16% of Java online submissions for Add Two Numbers II.
//category:link

public class P445_AddTwoNumbers2 {
	
	private ListNode r(ListNode head) {
		if (head.next == null) return head;
		ListNode current = head;
		ListNode last = null;
		while(current!=null) {
			ListNode temp = current.next;
			current.next = last;
			last = current;
			current = temp;
		}
		return last;
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode nl1 = r(l1);
		ListNode nl2 = r(l2);
		ListNode head = null;
		ListNode last = null;
		boolean carry = false;
		while (nl1 != null || nl2 != null) {
			int v = (nl1 != null ? nl1.val : 0) + (nl2 != null ? nl2.val : 0) + (carry ? 1 : 0);
			ListNode node = new ListNode(v%10);
			carry = v >= 10;
			if (head == null) {
				head = node;
			}
			if (last != null) {
				last.next = node;
			}
			last = node;
			if (nl1!=null) nl1 = nl1.next;
			if (nl2!=null) nl2 = nl2.next;
		}
		if (carry) {
			ListNode node = new ListNode(1);
			last.next = node;
		}
		
		return r(head);
    }
}
