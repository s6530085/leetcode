package me.sunmin.algorithm;
//https://leetcode.com/problems/partition-list/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Partition List.

public class P086_PartitionList {
	public ListNode partition(ListNode head, int x) {
		if (head == null) return head;
		
		ListNode lessHead = null;
		ListNode lessTail = null;
		ListNode moreHead = null;
		ListNode moreTail = null;
		ListNode current = head;
		while(current != null) {
			if (current.val < x) {
				if (lessHead == null) {
					lessHead = current;
					lessTail = current;
				}
				else {
					lessTail.next = current;
					lessTail = current;
				}
			}
			else {
				if (moreHead == null) {
					moreHead = current;
					moreTail = current;
				}
				else {
					moreTail.next = current;
					moreTail = current;
				}
			}
			current = current.next;
		}
		
		if (lessTail != null) {
			lessTail.next = moreHead;
		}
		if (moreTail != null) {
			moreTail.next = null;
		}
		
		return lessHead != null ? lessHead : moreHead;
    }
	
	public static void main(String[] args) {
		P086_PartitionList p = new P086_PartitionList();
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(2);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(2);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		ListNode n = p.partition(n1, 3);
	}
}
