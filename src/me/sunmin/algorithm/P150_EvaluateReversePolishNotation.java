package me.sunmin.algorithm;
//https://leetcode.com/problems/evaluate-reverse-polish-notation/
//Runtime: 5 ms, faster than 97.02% of Java online submissions for Evaluate Reverse Polish Notation.

import java.util.Stack;

public class P150_EvaluateReversePolishNotation {

	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for (String s : tokens) {
			boolean isOperation = true;
			if (s.length() == 1) {
				char cs = s.toCharArray()[0];
				if (cs == '+') {
					int i2 = stack.pop();
					int i1 = stack.pop();
					stack.push(i1+i2);
				}
				else if (cs == '-') {
					int i2 = stack.pop();
					int i1 = stack.pop();
					stack.push(i1-i2);
				}
				else if (cs == '*') {
					int i2 = stack.pop();
					int i1 = stack.pop();
					stack.push(i1*i2);
				}
				else if (cs == '/') {
					int i2 = stack.pop();
					int i1 = stack.pop();
					stack.push(i1/i2);
				}
				else {
					isOperation = false;
				}
			}
			else {
				isOperation = false;
			}
			
			if (!isOperation) {
				stack.push(Integer.valueOf(s));
			}
		}
		return stack.pop();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P150_EvaluateReversePolishNotation p = new P150_EvaluateReversePolishNotation();
		int i = p.evalRPN(new String[] {"2", "1", "+", "3", "*"});
		i = p.evalRPN(new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
	}

}
