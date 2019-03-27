package me.sunmin.algorithm;

import java.util.Arrays;

//https://leetcode.com/problems/valid-square/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Square.
//category:math

public class P593_ValidSquare {
	private static double distance(int[] p1, int[] p2) {
		return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);   
	}
	
	public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        double[] lines = {distance(p1, p2), distance(p1, p3), distance(p1,p4), distance(p2, p3), distance(p2, p4), distance(p3,p4)};
        Arrays.sort(lines);
        if (lines[0] == 0) return false;
        if ((lines[0] == lines[1]) && (lines[1] == lines[2]) && (lines[2] == lines[3]) 
        		&& (lines[4] == 2 * lines[0]) && (lines[5] == 2 * lines[0])) {
        	return true;
        }
        else {
        	return false;
        }
    }
	
}
