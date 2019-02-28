package me.sunmin.algorithm;
//https://leetcode.com/problems/intersection-of-two-linked-lists/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Intersection of Two Linked Lists.

public class P160_IntersectionTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode na = headA;
		ListNode nb = headB;
		int zeroCount = 0;
		while(zeroCount < 3) {
			if (na == nb) {
				return na;
			}
			if (na != null) {
				na = na.next;
			}
			else {
				zeroCount++;
				na = headB;
			}
			if (nb != null) {
				nb = nb.next;
			}
			else {
				zeroCount++;
				nb = headA;
			}
			
		}
		
		return null;
    }
}
