package me.sunmin.algorithm;
//https://leetcode.com/problems/valid-parentheses/
//Runtime: 4 ms, faster than 99.10% of Java online submissions for Valid Parentheses.

import java.util.Stack;

public class P020_ValidParentheses {
	public boolean isValid(String s) {
        char cs[] = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			}
			else {
				if (stack.isEmpty()) {
					return false;
				}
				char last = stack.peek();
				if (last == '(' && c == ')' || last == '[' && c == ']' || last == '{' && c == '}') {
					stack.pop();
				}
				else {
					return false;
				}
			}
		}
		return stack.isEmpty();


    }
}
