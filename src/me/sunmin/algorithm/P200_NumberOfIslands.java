package me.sunmin.algorithm;
//https://leetcode.com/problems/number-of-islands/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Number of Islands.


public class P200_NumberOfIslands {
	
	private char p(char[][] grid, int i, int j, char base) {
		char left = (j == 0 ? 0 : grid[i][j-1]);
		char right = (j == grid[0].length-1 ? 0 : grid[i][j+1]);
		char top = (i == 0 ? 0 : grid[i-1][j]);
		char bottom = (i == grid.length-1 ? 0 : grid[i+1][j]);
		char max = (char)Math.max(left, Math.max(right, Math.max(top, bottom)));
		if (max <= '1') {
			base++;
			grid[i][j] = base; 
		}
		else {
			grid[i][j] = max;
		}
		if (left == '1') {
			p(grid, i, j-1, base);
		}
		if (right == '1') {
			p(grid, i, j+1, base);
		}
		if (top == '1') {
			p(grid, i-1, j, base);
		}
		if (bottom == '1') {
			p(grid, i+1, j, base);
		}
		return base;
	}
	
	public int numIslands(char[][] grid) {
        char base = '1';
        for (int i = 0; i < grid.length; i++) {
        	for (int j = 0; j < grid[0].length; j++) {
        		if (grid[i][j] == '0') {
        			continue;
        		}
        		else if (grid[i][j] == '1') {
        			base = p(grid, i, j, base);
        		}
        	}
        }
        return base - '1';
    }
}
