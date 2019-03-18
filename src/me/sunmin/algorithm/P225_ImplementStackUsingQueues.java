package me.sunmin.algorithm;
//https://leetcode.com/problems/implement-stack-using-queues/
//Runtime: 45 ms, faster than 91.62% of Java online submissions for Implement Stack using Queues.

import java.util.LinkedList;
import java.util.Queue;

public class P225_ImplementStackUsingQueues {

	
	private Queue<Integer> front = new LinkedList<Integer>();
	private Queue<Integer> rear = new LinkedList<Integer>();
	
	/** Push element x onto stack. */
    public void push(int x) {
        front.offer(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(front.size() > 1) {
        	rear.offer(front.poll());
        }
        int p =  front.poll();
        while (!rear.isEmpty()) {
        	front.offer(rear.poll());
        }
        return p;
    }
    
    /** Get the top element. */
    public int top() {
    	while(front.size() > 1) {
        	rear.offer(front.poll());
        }
        int p =  front.poll();
        rear.offer(p);
        while (!rear.isEmpty()) {
        	front.offer(rear.poll());
        }
        return p;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
    	return front.isEmpty();
    }
    
    
    public static void main(String[] args) {
    	P225_ImplementStackUsingQueues s = new P225_ImplementStackUsingQueues();
    	s.push(1);
    	s.push(2);
    	s.top();
    	s.pop();
    	s.empty();
    }
}
