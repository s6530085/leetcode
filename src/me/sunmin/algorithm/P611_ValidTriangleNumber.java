package me.sunmin.algorithm;
//https://leetcode.com/problems/valid-triangle-number/
//Runtime: 35 ms, faster than 34.74% of Java online submissions for Valid Triangle Number.


import java.util.Arrays;

public class P611_ValidTriangleNumber {
	public int triangleNumber(int[] nums) {
		int number = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-2; i++) {
			int vi = nums[i];
			for (int j = i+1; j < nums.length-1; j++) {
				int vj = nums[j];
				int pos = Arrays.binarySearch(nums, j+1, nums.length, vi+vj);
				if (pos < -1) {
					number += -pos-2-j; 
				}
				else {
					while (pos > j) {
						if (nums[pos] < vi+vj) break;
						pos--;
					}
					if (pos > j) {
						number += pos-j;
					}
				}
			}
		}
		return number;
    }
}
