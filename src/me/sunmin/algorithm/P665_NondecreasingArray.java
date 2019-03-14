package me.sunmin.algorithm;
//https://leetcode.com/problems/non-decreasing-array/
//Runtime: 8 ms, faster than 100.00% of Java online submissions for Non-decreasing Array.

public class P665_NondecreasingArray {
	public boolean checkPossibility(int[] nums) {
		boolean has = false;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] > nums[i+1]) {
				if (has) return false;
				has = true;
				if (i > 0) {
                    if (nums[i-1] <= nums[i+1]) nums[i] = nums[i-1];
                    else nums[i+1] = nums[i];
				}
			}
		}
		return true;
    }
	
	public static void main(String[] args) {
		char c = 'a' + 'b' + 'c';
		System.out.println('a'+4);
		P665_NondecreasingArray d = new P665_NondecreasingArray();
		boolean b = d.checkPossibility(new int [] {2,3,3,2,4});
	}

}
