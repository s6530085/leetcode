package me.sunmin.algorithm;
//https://leetcode.com/problems/unique-paths/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.

public class P062_UniquePaths {
	
	public int uniquePaths(int m, int n) {
        int matrix[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		if (i == 0 || j == 0) {
        			matrix[i][j] = 1;
        		}
        		else {
        			matrix[i][j] = matrix[i][j-1] + matrix[i-1][j];
        		}
        	}
        }
        return matrix[m-1][n-1];
    }
	
	
	public static void main(String[] args) {
		P062_UniquePaths u = new P062_UniquePaths();
		int i = u.uniquePaths(8, 2);
		i = u.uniquePaths(2, 2);
		i = u.uniquePaths(3, 3);
		i = u.uniquePaths(4, 4);
		i = u.uniquePaths(5, 5);
		i = u.uniquePaths(6, 6);
		i = u.uniquePaths(7, 7);
	}
}	
