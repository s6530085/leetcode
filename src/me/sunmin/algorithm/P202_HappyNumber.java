package me.sunmin.algorithm;
//https://leetcode.com/problems/happy-number/
//Runtime: 1 ms, faster than 95.38% of Java online submissions for Happy Number.

import java.util.HashSet;
import java.util.Set;

public class P202_HappyNumber {
	
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		while (true) {
			if (set.contains(n)) return false;
			else set.add(n);
			int nn = 0;
			while (n > 0) {
				nn += Math.pow(n%10, 2);
				n /= 10;
			}
			if (nn == 1) return true;
			else n = nn;
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P202_HappyNumber h = new P202_HappyNumber();
		boolean b = h.isHappy(1);
		b = h.isHappy(3);
		b = h.isHappy(4);
	}

}
