package me.sunmin.algorithm;
//https://leetcode.com/problems/single-number/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.

public class P136_SingleNumber {

	public int singleNumber(int[] nums) {
		int i = nums[0];
		for (int index = 1; index < nums.length; index++) {
			i ^= nums[index];
		}
		return i;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
