package me.sunmin.algorithm;
import java.util.ArrayList;
import java.util.Arrays;
//https://leetcode.com/problems/triangle/submissions/
//Runtime: 3 ms, faster than 99.85% of Java online submissions for Triangle.

import java.util.List;

public class P120_Triangle {
	
	public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle == null || triangle.size() == 0) return 0;
		List<Integer> lastRow = triangle.get(triangle.size()-1);
		int values[] = new int[lastRow.size()];
		for (int i = 0; i < values.length; i++) {
			values[i] = lastRow.get(i);
		}
		for (int i = triangle.size()-2; i >= 0; i--) {
			List<Integer>row = triangle.get(i);
			for (int j = 0; j < triangle.get(i).size(); j++) {
				values[j] = Math.min(values[j], values[j+1]) + row.get(j);
			}
		}
		return values[0];
    }
	
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(Arrays.asList(new Integer[] {-1}));
		list.add(Arrays.asList(new Integer[] {2,3}));
		list.add(Arrays.asList(new Integer[] {1,-1,-3}));
		P120_Triangle t = new P120_Triangle();
		int i = t.minimumTotal(list);
	}
}
