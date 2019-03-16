package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//https://leetcode.com/problems/sort-list/
//Runtime: 13 ms, faster than 13.91% of Java online submissions for Sort List.
// todosm use merge sort

public class P148_SortList {
	public ListNode sortList(ListNode head) {
		List<ListNode> l = new ArrayList<ListNode>();
		while(head!=null) {
			l.add(head);
			head = head.next;
		}
		Collections.sort(l, new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}
			
		});
		
		head = null;
		ListNode current = null;
		for (ListNode node : l) {
			if (head == null) {
				head = node;
				current = node;
			}
			else {
				current.next = node;
				current = node;
				current.next = null;
			}
		}
		return head;
    }
}
