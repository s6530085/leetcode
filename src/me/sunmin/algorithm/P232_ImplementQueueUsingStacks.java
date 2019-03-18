package me.sunmin.algorithm;

import java.util.Stack;

//https://leetcode.com/problems/implement-queue-using-stacks/
//Runtime: 44 ms, faster than 99.86% of Java online submissions for Implement Queue using Stacks.

public class P232_ImplementQueueUsingStacks {
	
	/** Initialize your data structure here. */
    public P232_ImplementQueueUsingStacks() {
        
    }

    private Stack<Integer> front = new Stack<Integer>();
    private Stack<Integer> rear = new Stack<Integer>();

    /** Push element x to the back of queue. */
    public void push(int x) {
        front.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	
        while (front.size() > 1) {
        	rear.push(front.pop());
        }
        int pop = front.pop();
        while (!rear.isEmpty()) {
        	front .push(rear.pop());
        }
        
        return pop;
    }
    
    /** Get the front element. */
    public int peek() {
    	while (front.size() > 1) {
        	rear.push(front.pop());
        }
        int pop = front.peek();
        while (!rear.isEmpty()) {
        	front .push(rear.pop());
        }
        
        return pop;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    	return front.isEmpty();
    }
}
