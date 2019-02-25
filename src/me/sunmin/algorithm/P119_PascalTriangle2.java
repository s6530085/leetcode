package me.sunmin.algorithm;
//https://leetcode.com/problems/pascals-triangle-ii/
//Runtime: 1 ms, faster than 89.63% of Java online submissions for Pascal's Triangle II.

import java.util.ArrayList;
import java.util.List;

public class P119_PascalTriangle2 {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> l = null;
		for (int i = 0; i <= rowIndex; i++) {
			List<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					temp.add(1);
				}
				else {
					if (i >= 2) {
						temp.add(l.get(j-1)+l.get(j));
					}
				}
			}
			l = temp;
		}
		return l;
    }
	
	public static void main(String[] args) {
		P119_PascalTriangle2 p = new P119_PascalTriangle2();
		List<Integer> l = p.getRow(3);
	}
}
