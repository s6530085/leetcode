//https://leetcode.com/problems/add-two-numbers/
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//todosm
package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

public class P002_AddTwoNumbers {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		boolean carry = false;
		
        List<Integer> l = new ArrayList<Integer>();
        while(l1!=null && l2 != null) {
        	int digit = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + (carry ? 1 : 0);
        	carry = digit > 9;
        	l.add(digit%10);
        	if (l1 != null) l1 = l1.next;
        	if (l2 != null) l2 = l2.next;
        }
        if (carry) {
        	l.add(1);
        }
        ListNode head = null;
        ListNode last = null;
        for (int i = 0; i < l.size(); i++) {
        	ListNode current = new ListNode(l.get(i));
        	if (head == null) {
        		head = current;
        	}
        	else {
        		last.next = current;
        	}
        	last = current;
        }
        return head;
    }

}
