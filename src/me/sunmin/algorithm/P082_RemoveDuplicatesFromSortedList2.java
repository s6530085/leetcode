package me.sunmin.algorithm;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List II.

public class P082_RemoveDuplicatesFromSortedList2 {
	
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) return null;
		if (head.next == null) return head;
		
		ListNode realHead = head;
		ListNode tPrev = null;
		ListNode tHead = head;
		ListNode tTail = head;
		while(true) {
			tTail = tTail.next;
			if (tTail.val == tHead.val) {
				if (tTail.next == null) {
					if (tPrev != null) {
						tPrev.next = null;
					}
					else {
						realHead = null;
					}
					break;
				}
			}
			else {
				if (tTail.next == null) {
					if (tTail != tHead.next) {
						if (tPrev != null) {
							tPrev.next = tTail;
						}
						else {
							realHead = tTail;
						}
					}
					break;
				}
				else {
					if (tTail != tHead.next) {
						if (tHead == realHead) {
							realHead = tTail.next;
						}
						if (tPrev != null) {
							tPrev.next = tTail;
						}
						else {
							realHead = tTail;
						}
					}
					else {
						tPrev = tHead;
					}
					tHead = tTail;
				}
			}
		}
		return realHead;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(4);
		ListNode n7 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		
		P082_RemoveDuplicatesFromSortedList2 l = new P082_RemoveDuplicatesFromSortedList2();
		ListNode n = l.deleteDuplicates(n1);
		
	}

}
