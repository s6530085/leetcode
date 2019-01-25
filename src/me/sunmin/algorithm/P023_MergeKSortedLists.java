package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//https://leetcode.com/problems/merge-k-sorted-lists/
//Runtime: 17 ms, faster than 50.79% of Java online submissions for Merge k Sorted Lists.


public class P023_MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> l = new ArrayList<ListNode>();
		for (int i = 0; i < lists.length; i++) {
			ListNode n = lists[i];
			while (n != null) {
				l.add(n);
				n = n.next;
			}
		}
		
		l.sort(new Comparator<ListNode>() {
			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}
		});
		
		for (int i = 1; i < l.size(); i++) {
			l.get(i-1).next = l.get(i);
		}
		
		
        if (l.size() > 0) {
        	l.get(l.size()-1).next = null;
        	return l.get(0);
        }
        return null;

    }
	
	public static void main(String[] args) {
		//[[1,4,5],[1,3,4],[2,6]]
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		
		ListNode n4 = new ListNode(1);
		ListNode n5 = new ListNode(3);
		ListNode n6 = new ListNode(4);
		n4.next = n5;
		n5.next = n6;
		
		ListNode n7 = new ListNode(2);
		ListNode n8 = new ListNode(6);
		n7.next = n8;
		
		P023_MergeKSortedLists m = new P023_MergeKSortedLists();
		ListNode n = m.mergeKLists(new ListNode[] {n1, n4, n7});
		
	}
}
