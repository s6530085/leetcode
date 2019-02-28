package me.sunmin.algorithm;
//https://leetcode.com/problems/intersection-of-two-linked-lists/
//
import java.util.HashSet;
import java.util.Set;

public class P160_IntersectionTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode>set = new HashSet<ListNode>();
		ListNode n = headA;
		while(n != null) {
			set.add(n);
			n = n.next;
		}
		n = headB;
		while(n != null) {
			if (set.contains(n)) {
				return n;
			}
			n = n.next;
		}
		return null;
    }
}
