package me.sunmin.algorithm;
//https://leetcode.com/problems/linked-list-random-node/
//Runtime: 53 ms, faster than 99.81% of Java online submissions for Linked List Random Node.
//category:link

public class P382_LinkedListRandomNode {
	public P382_LinkedListRandomNode(ListNode head) {
        this.head = head;
        while(head != null) {
        	head = head.next;
        	count++;
        }
    }
	
	private int count = 0;
    private ListNode head = null;
    /** Returns a random node's value. */
    public int getRandom() {
        int c = (int)(Math.random()*count);
        ListNode current = head;
        while(c > 0) {
        	current = current.next;
        	c--;
        }
        return current.val;
    }
}
