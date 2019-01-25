package me.sunmin.algorithm;
//https://leetcode.com/problems/swap-nodes-in-pairs/
//Runtime: 2 ms, faster than 99.98% of Java online submissions for Swap Nodes in Pairs.

public class P024_SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
        ListNode first = null;
		ListNode second = null;
		ListNode current = head;
		ListNode firstPrev = null;
		ListNode swappedHead = null;
		int index = 1;
		while(current != null) {
			if (index % 2 == 0) {
				second = current;
				if (firstPrev != null) {
					firstPrev.next = second;
				}
				first.next = null;
				ListNode realNext = second.next;
				second.next = first;
				if (swappedHead == null) {
					swappedHead = second;
				}
				firstPrev = first;
				current = realNext;
			}
			else {
				first = current;
				current = current.next;
				if (current == null) {
					if (firstPrev != null) {
						firstPrev.next = first;
					}
				}
			}
			index++;
		}
		return swappedHead == null ? head : swappedHead;

    }
}
