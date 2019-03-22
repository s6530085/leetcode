package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/lemonade-change/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Lemonade Change.

public class P860_LemonadeChange {
	
	public boolean lemonadeChange(int[] bills) {
		int c5 = 0;
		int c10 = 0;
		for (int i : bills) {
			if (i == 5) {
				c5++;
			}
			else if (i == 10) {
				if (c5 == 0) return false;
				else {
					c5--;
					c10++;
				}
			}
			else {
				if (c10 > 0 && c5 > 0) {
					c10--;
					c5--;
				}
				else if (c5 >= 3) {
					c5 -= 3;
				}
				else return false;
			}
		}
		return true;	
    }
	
	
}
