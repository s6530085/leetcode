package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/powerful-integers/
//Runtime: 4 ms, faster than 99.84% of Java online submissions for Powerful Integers.

public class P970_PowerfulIntegers {
	public List<Integer> powerfulIntegers(int x, int y, int bound) {
		Set<Integer> set = new HashSet<Integer>();
		for (int px = 1; px < bound; px *= x) {
			for (int py = 1; py < bound; py *=y) {
				if (px + py <= bound) {
					set.add(px+py);
					if (y == 1) break;
				}
				else {
					break;
				}
			}
			if (x == 1) break;
		}
		List<Integer>l = new ArrayList<Integer>(set);
		return l;
    }
	
	public static void main(String[] args) {
		
		P970_PowerfulIntegers p = new P970_PowerfulIntegers();
		List k = p.powerfulIntegers(1, 2, 100);
	}
}
