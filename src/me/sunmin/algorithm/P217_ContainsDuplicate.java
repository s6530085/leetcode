package me.sunmin.algorithm;

import java.util.Arrays;

//https://leetcode.com/problems/contains-duplicate/
//Runtime: 5 ms, faster than 96.24% of Java online submissions for Contains Duplicate.

public class P217_ContainsDuplicate {
	
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i+1]) {
				return true;
			}
		}
		return false;
	}
	
	 public int pivotIndex(int[] nums) {
		 if (nums.length >= 2) {
			 int sum = 0;
			 for (int n : nums) {
				 sum += n;
			 }
			 int leftSum = 0;
			 int rightSum = sum;
			 for (int i = 0; i < nums.length - 1; i++) {
				 int p = nums[i];
				 if (leftSum == rightSum - p) {
					 return i;
				 }
				 else {
					 leftSum += p;
					 rightSum -= p;
				 }
			 }
		 }
		 
		 return -1;
	 }
	 
	 public int dominantIndex(int[] nums) {
		 int nn[] = Arrays.copyOf(nums, nums.length);
		 Arrays.sort(nums);
		 if (nums[nums.length-1] > nums[nums.length-2] * 2) {
			 int v = nums[nums.length-1];
			 for (int i = 0; i < nn.length; i++) {
				 if (nn[i] == v) {
					 return i;
				 }
			 }
		 }
		 return -1;
	 }
	 
	 
	 public static void main (String[] args) {
		 P217_ContainsDuplicate d= new P217_ContainsDuplicate();
		 int p = d.pivotIndex(new int[] {-1,0});
	 }
	 
}
