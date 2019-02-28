package me.sunmin.algorithm;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Array.


public class P189_RotateArray {

	public void rotate(int[] nums, int k) {
		int[] left = Arrays.copyOfRange(nums, nums.length-k, nums.length);
		int[] right = Arrays.copyOfRange(nums, 0, nums.length - k);
		for (int i = 0; i < left.length; i++) {
			nums[i] = left[i];
		}
		for (int i = 0; i < right.length; i++) {
			nums[k+i] = right[i];
		}
    }
	
	public static void main(String [] args) {
		P189_RotateArray r = new P189_RotateArray();
		int[] nums = {1,2,3,4,5,6,7};
		r.rotate(nums, 3);
		
	}
}
