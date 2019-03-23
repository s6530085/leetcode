package me.sunmin.algorithm;

public class L_Recursion_SwapNodesPairs {
	public ListNode swapPairs(ListNode head) {
		if (head == null) return null;
		if (head.next == null) return head;
		ListNode nHead = head.next;
		ListNode nextPair = head.next.next;
		head.next.next = head;
		head.next = swapPairs(nextPair);
		return nHead;
    }
}
