package me.sunmin.algorithm;
//https://leetcode.com/problems/climbing-stairs/
//Runtime: 2 ms, faster than 92.65% of Java online submissions for Climbing Stairs.

public class P070_ClimbingStairs {
	public int climbStairs(int n) {
		if (n < 0) return 0;
		if (n == 0) return 1;
		int l1 = 0;
		int l2 = 1;
		for (int i = 1; i <= n; i++) {
			int temp = l2;
			l2 = l1 + l2;
			l1 = temp;
		}
		return l2;
    }
	
	public static void main(String[] args) {
		P070_ClimbingStairs c = new P070_ClimbingStairs();
		int i = c.climbStairs(3);
	}
}
