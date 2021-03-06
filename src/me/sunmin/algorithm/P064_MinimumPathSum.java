package me.sunmin.algorithm;
//https://leetcode.com/problems/minimum-path-sum/
//Runtime: 4 ms, faster than 97.83% of Java online submissions for Minimum Path Sum.

public class P064_MinimumPathSum {
	public int minPathSum(int[][] grid) {
        for (int i = 0 ; i < grid.length; i++) {
        	for (int j = 0; j < grid[0].length; j++) {
        		if (i == 0 && j == 0) {
        			
        		}
        		else if (i == 0) {
        			grid[i][j] += grid[i][j-1];
        		}
        		else if (j == 0) {
        			grid[i][j] += grid[i-1][j];
        		}
        		else {
        			grid[i][j] += Math.min(grid[i][j-1], grid[i-1][j]);
        		}
        	}
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
