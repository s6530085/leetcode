package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/rectangle-overlap/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Prime Number of Set Bits in Binary Representation.

public class P836_RectangleOverlap {
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		if (rec1[0] <= rec2[0]) {
			if (rec2[0] >= rec1[2]) {
				return false;
			}
		}
		else {
			if (rec1[0] >= rec2[2]) {
				return false;
			}
		}
		if (rec1[1] <= rec2[1]) {
			if (rec2[1] >= rec1[3]) {
				return false;
			}
		}
		else {
			if (rec1[1] >= rec2[3]) {
				return false;
			}
		}
		
		return true;
    }
	
	
	public static void main(String[] args) {
		P836_RectangleOverlap o = new P836_RectangleOverlap();
		boolean b = o.isRectangleOverlap(new int[] {5,15,8,18}, new int[] {0,3,7,9});
	}
}
