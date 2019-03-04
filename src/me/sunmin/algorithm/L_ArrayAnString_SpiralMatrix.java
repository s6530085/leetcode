package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

public class L_ArrayAnString_SpiralMatrix {
	
	
	public List<Integer> spiralOrder(int[][] matrix) {
		"aaa".length();
		List<Integer> list = new ArrayList<Integer>();
		if (matrix.length > 0) {
			int rt = 0;
			int rb = matrix.length - 1;
			int cl = 0;
			int cr = matrix[0].length - 1;
			while (rt <= rb && cl <= cr) {
				for (int c = cl; c <= cr; c++) list.add(matrix[rt][c]);
				for (int r = rt+1; r <= rb; r++) list.add(matrix[r][cr]);
				if (rb > rt && cr > cl) {
					for (int c = cr-1; c >= cl; c--) list.add(matrix[rb][c]);
					for (int r = rb-1; r > rt; r--) list.add(matrix[r][cl]);
				}
				rt++;
				rb--;
				cl++;
				cr--;
			}
		}
		return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
