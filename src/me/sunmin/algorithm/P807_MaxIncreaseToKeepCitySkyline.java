package me.sunmin.algorithm;
//https://leetcode.com/problems/max-increase-to-keep-city-skyline/
//Runtime: 10 ms, faster than 86.71% of Java online submissions for Max Increase to Keep City Skyline.

public class P807_MaxIncreaseToKeepCitySkyline {
	public int maxIncreaseKeepingSkyline(int[][] grid) {
        int increase = 0;
		int[] maxV = new int[grid.length];
		int[] maxH = new int[grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			int mv = Integer.MIN_VALUE;
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] > mv) {
					mv = grid[i][j]; 
				}
			}
			maxV[i] = mv;
		}
		for (int i = 0; i < grid[0].length; i++) {
			int mh = Integer.MIN_VALUE;
			for (int j = 0; j < grid.length; j++) {
				if (grid[j][i] > mh) {
					mh = grid[j][i];
				}
			}
			maxH[i] = mh;
		}
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				increase += Math.min(maxV[i], maxH[j]) - grid[i][j];
			}
		}
		
		return increase;

    }
}
