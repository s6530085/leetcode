package me.sunmin.algorithm;
//https://leetcode.com/problems/reorder-list/
//Runtime: 2 ms, faster than 99.31% of Java online submissions for Reorder List.


public class P143_ReorderList {

	private ListNode reverse(ListNode head) {
		ListNode current = head.next;
		ListNode last = head;
		last.next = null;
		while(current != null) {
			ListNode temp = current.next;
			current.next = last;
			last = current;
			current = temp;
		}
		return last;
	}
	
	public void reorderList(ListNode head) {
		if (head == null) return;
		if (head.next == null) return;
		
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode ts = slow.next;
		slow.next = null;
		ts = reverse(ts);
		
		ListNode th = head;
		while (ts != null) {
			ListNode temp = th.next;
			th.next = ts;
			ListNode t2 = ts.next;
			ts.next = temp;
			th = temp;
			ts = t2;
		}
    }
	
	public static void main(String[] args) {
		P143_ReorderList r = new P143_ReorderList();
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next =n3;
		n3.next = n4;
		n4.next = n5;
		r.reorderList(n1);
	}
}
