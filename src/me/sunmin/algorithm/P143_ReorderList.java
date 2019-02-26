package me.sunmin.algorithm;

public class P143_ReorderList {

	private ListNode reverse(ListNode head) {
		ListNode current = head.next;
		ListNode last = head;
		last.next = null;
		while(current != null) {
			ListNode tem = current.next;
			current.next = last;
			last = current;
			current = tem;
		}
		return current;
	}
	
	public void reorderList(ListNode head) {
		if (head == null) return;
		if (head.next == null) return;
		
		
    }
}
