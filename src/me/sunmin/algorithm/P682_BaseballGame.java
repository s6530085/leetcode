package me.sunmin.algorithm;
//https://leetcode.com/problems/baseball-game/description/
//Runtime: 2 ms, faster than 98.06% of Java online submissions for Baseball Game.


import java.util.LinkedList;
import java.util.List;

public class P682_BaseballGame {
	public int calPoints(String[] ops) {
		int sum = 0;
		List<Integer> list = new LinkedList<Integer>();
		for (String s : ops) {
			if (s.equals("C")) {
				int v = list.get(0);
				list.remove(0);
				sum -= v;
			}
			else if (s.equals("D")) {
				int v = list.get(0) * 2;
				list.add(0, v);
				sum += v;
			}
			else if (s.equals("+")) {
				int v = list.get(0) + list.get(1);
				list.add(0, v);
				sum += v;
			}
			else {
				int v = Integer.valueOf(s);
				list.add(0, v);
				sum += v;
			}
		}
		
		return sum;
    }
}
