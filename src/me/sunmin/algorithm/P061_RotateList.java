package me.sunmin.algorithm;
//https://leetcode.com/problems/rotate-list
//Runtime: 7 ms, faster than 98.21% of Java online submissions for Rotate List.

public class P061_RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null) return null;
        if (k == 0) return head;
		int length = 0;
		ListNode tail = null;
        ListNode current = head;
        while(current != null) {
        	length++;
        	if (current.next == null) {
        		tail = current;
        	}
        	current = current.next;
        }
        k = k % length;
        if (k == 0) return head;
        current = head;
        for (int i = 0; i < length - k; i++) {
            if (i == length -k - 1) {
                ListNode t = current;
                current = current.next;
                t.next = null;
            }
            else {
                current = current.next;
            }
        }

        ListNode newHead = current;
        tail.next = head;
        
        return newHead;
    }
}
