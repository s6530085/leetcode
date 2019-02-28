package me.sunmin.algorithm;
//https://leetcode.com/problems/min-stack/
//Runtime: 49 ms, faster than 100.00% of Java online submissions for Min Stack.

import java.util.Stack;

public class P155_MinStack {
	
	private int count = 0;
	private int min = Integer.MAX_VALUE;
	private Stack<Integer>s = new Stack<Integer>();
	
	public P155_MinStack() {
		
    }
    
    public void push(int x) {
        if (x < min) {
        	min = x;
        	count = 1;
        }
        else if (x == min) {
        	count++;
        }
        s.push(x);
    }
    
    public void pop() {
        int i = s.pop();
        if (i == min) {
        	count--;
        	if (count == 0) {
        		int tempMin = Integer.MAX_VALUE;
        		for (int j : s) {
        			if (j < tempMin) {
        				tempMin = j;
        				count = 1;
        			}
        			else if (j == tempMin) {
        				count++;
        			}
        		}
        		min = tempMin;
        	}
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
    }
}
