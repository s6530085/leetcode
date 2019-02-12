package me.sunmin.algorithm;
//https://leetcode.com/problems/unique-paths-ii/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths II.

public class P063_UniquePaths2 {

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid[0][0] == 1) return 0;
        int grid[][] = new int[obstacleGrid.length+1][obstacleGrid[0].length+1];
        for (int i = 0; i < grid.length; i++) {
        	for (int j = 0; j < grid[0].length; j++) {
        		if (i == 0 || j == 0) {
        			grid[i][j] = 0;
        		}
        		else {
                    if (i == 1 && j == 1) {
                        grid[i][j] = 1;
                    }
        			else if (obstacleGrid[i-1][j-1] == 1) {
        				grid[i][j] = 0;
        			}
        			else {
        				grid[i][j] = grid[i-1][j] + grid[i][j-1];
        			}
        		}
        	}
        }
        return grid[obstacleGrid.length][obstacleGrid[0].length];
    }
}
