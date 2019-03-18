package me.sunmin.algorithm;
//https://leetcode.com/problems/palindrome-linked-list/
//Runtime: 1 ms, faster than 94.33% of Java online submissions for Palindrome Linked List.
//category:link
public class P234_PalindromeLinkedList {
	
	public boolean isPalindrome(ListNode head) {
		if (head == null) return false;
		int count = 0;
		ListNode current = head;
		while(current!=null) {
			count++;
			current = current.next;
		}
		int[] nums = new int[count];
		count = 0;
		current = head;
		while(current!=null) {
			nums[count++] = current.val;
			current = current.next;
		}
		for (int i = 0; i < count/2; i++) {
			if (nums[i] != nums[count - i - 1]) {
				return false;
			}
		}
		return true;
    }
}
