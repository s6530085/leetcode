package me.sunmin.algorithm;
//https://leetcode.com/problems/reverse-nodes-in-k-group/
//Runtime: 8 ms, faster than 9.88% of Java online submissions for Reverse Nodes in k-Group.
//todosm

import java.util.Stack;

public class P025_ReverseNodesInkGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
		int index = 1;
		ListNode firstPrev = null;
		Stack<ListNode> group = new Stack<ListNode>();
		ListNode current = head;
		ListNode swappedHead = null;
		while(current != null) {
			group.push(current);
			if (index%k == 0) {
				ListNode last = firstPrev;
				ListNode top = group.peek();
				current = top.next;
				while (!group.isEmpty()) {
					ListNode node = group.pop();
					if (swappedHead == null) {
						swappedHead = node;
					}
					if (last != null) {
						last.next = node;
					}
					node.next = null;
					last = node;
				}
				firstPrev = last;
			}
			else {
				current = current.next;
				if (current == null) {
					ListNode node = group.get(0);
					if (firstPrev != null) {
						firstPrev.next = node;
					}
					if (swappedHead == null) {
						swappedHead = node;
					}
				}
			}
			index++;
		}
		
		return swappedHead;

    }
}
