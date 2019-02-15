package me.sunmin.algorithm;
//https://leetcode.com/problems/reverse-linked-list-ii/
//Runtime: 2 ms, faster than 97.09% of Java online submissions for Reverse Linked List II.

public class P092_ReverseLinkedList2 {

	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (head == null) return null;
		if (m == n) return head;
		
		ListNode realHead = head;
		ListNode current = head;
		ListNode headPrev = null;
		ListNode tTail = null;
		ListNode prev = null;
		ListNode next = current;
		int index = 1;
		while(current!=null) {
			next = current.next;
			if (index < m) {
				if (index == m - 1){
					headPrev = current;
				}
			}
			else  {
				if (index == m) {
					tTail = current;
				}
				else if (index > m && index <= n) {
					if (index == n) {
						if (m == 1) {
							realHead = current;
						}
						else {
							headPrev.next = current;
						}
						tTail.next = current.next;
						current.next = prev;
						break;
					}
					else {
						current.next = prev;
					}
				}
				prev = current;
			}
			index++;
			current = next;
		}
		return realHead;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P092_ReverseLinkedList2 l = new P092_ReverseLinkedList2();
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ListNode n = l.reverseBetween(n1, 2, 4);

	}

}
