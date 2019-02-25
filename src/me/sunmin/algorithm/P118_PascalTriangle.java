package me.sunmin.algorithm;
//https://leetcode.com/problems/pascals-triangle/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.

import java.util.ArrayList;
import java.util.List;

public class P118_PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		int row = 1;
		while(row<=numRows) {
			List<Integer>l = new ArrayList<Integer>();
			for (int i = 0;i < row; i++) {
				if (i == 0 || i == row - 1) {
					l.add(1);
				}
				else {
					if (row > 2) {
						l.add(list.get(row-2).get(i-1)+list.get(row-2).get(i));
					}
				}
			}
			list.add(l);
			row++;
		}
				
		return list;
    }
}
