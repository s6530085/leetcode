package me.sunmin.algorithm;
import java.util.Arrays;
//https://leetcode.com/problems/majority-element/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Majority Element.

public class P169_MajorityElement {
	
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
