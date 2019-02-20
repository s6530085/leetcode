package me.sunmin.algorithm;
//https://leetcode.com/problems/surface-area-of-3d-shapes/
//Runtime: 6 ms, faster than 95.52% of Java online submissions for Surface Area of 3D Shapes.

public class P892_SurfaceArea3DShapes {
	
	public int surfaceArea(int[][] grid) {
		int sum = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				int v = grid[i][j];
				sum += v * 6 - (v > 1 ? (v - 1) * 2 : 0);
			}
		}
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length - 1; j++) {
				sum -= Math.min(grid[i][j], grid[i][j+1]) * 2;
			}
		}
		for (int j = 0; j < grid[0].length; j++) {
			for (int i = 0; i < grid.length - 1; i++) {
				sum -= Math.min(grid[i][j], grid[i+1][j]) * 2;
			}
		}
		return sum;
    }
	
	public static void main(String[] args) {
		P892_SurfaceArea3DShapes s = new P892_SurfaceArea3DShapes();
		int i = s.surfaceArea(new int[][] {{1,2},{3,4}});
	}
}
