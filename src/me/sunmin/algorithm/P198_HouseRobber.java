package me.sunmin.algorithm;
//https://leetcode.com/problems/house-robber/
//Runtime: 2 ms, faster than 100.00% of Java online submissions for House Robber.
//category:dp
public class P198_HouseRobber {
	public int rob(int[] nums) {
		if (nums.length == 0) return 0;
		if (nums.length == 1) return nums[0];
		if (nums.length == 2) return Math.max(nums[0], nums[1]);
		int[] r = new int[nums.length];
		r[0] = nums[0];
		r[1] = Math.max(nums[0],nums[1]); 
		for (int i = 2; i < nums.length; i++) {
			r[i] = Math.max(r[i-1], nums[i] + r[i-2]);
		}
		
		return r[nums.length-1];
	}
	
	public static void main(String[] args) {
		P198_HouseRobber r = new P198_HouseRobber();
		int i = r.rob(new int[] {1,2,3,1});
	}
}
