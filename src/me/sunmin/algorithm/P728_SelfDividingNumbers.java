package me.sunmin.algorithm;
//https://leetcode.com/problems/self-dividing-numbers/
//Runtime: 6 ms, faster than 78.76% of Java online submissions for Self Dividing Numbers.

import java.util.ArrayList;
import java.util.List;

public class P728_SelfDividingNumbers {
	public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<Integer>();
		
		for (int i = left; i <= right; i++) {
			int source = i;
			boolean ok = true;
			while (source > 0) {
				int remain = source%10;
				if (remain!=0 && i% remain == 0) {
					source = source/10;
				} else {
					ok = false;
					break;
				}
			}
			if (ok) {
				l.add(i);
			}
		}
		
		return l;

    }
}
