package me.sunmin.algorithm;
//https://leetcode.com/problems/insertion-sort-list/
//Runtime: 32 ms, faster than 34.04% of Java online submissions for Insertion Sort List.

public class P147_InsertionSortList {

	public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode sortedHead = head;
        ListNode toSort = head.next;
        head.next = null;
        
        while(toSort != null) {
        	ListNode current = sortedHead;
        	ListNode last = null;
        	boolean insertAtLast = true;
        	while(current != null) {
        		if (toSort.val < current.val) {
    				ListNode temp = toSort.next;
        			if (current == sortedHead) {
        				toSort.next = current;
        				sortedHead = toSort;
        			}
        			else {
        				last.next = toSort;
        				toSort.next = current;
        			}
        			toSort = temp;
        			insertAtLast = false;
        			break;
        		}
        		last = current;
        		current = current.next;
        	}
        	if (toSort == null) break;
        	if (insertAtLast) {
        		if (last != null) {
        			last.next = toSort;
        		}
        		ListNode t = toSort;
        		toSort = toSort.next;
        		t.next = null;
        	}
        }
        return sortedHead;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1 = new ListNode(4);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(1);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next =n3;
		n3.next = n4;
		n4.next = n5;
		
		P147_InsertionSortList s = new P147_InsertionSortList();
		ListNode h = s.insertionSortList(n1);
	}

}
