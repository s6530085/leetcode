package me.sunmin.algorithm;
//https://leetcode.com/problems/house-robber-ii/
//Runtime: 2 ms, faster than 100.00% of Java online submissions for House Robber II.
//category:dp

public class P213_HouseRobber2 {

	public int rob(int[] nums) {
		if (nums.length == 0) return 0;
		if (nums.length == 1) return nums[0];
		if (nums.length == 2) return Math.max(nums[0], nums[1]);
		
		int[] r0 = new int[nums.length];
		int[] r1 = new int[nums.length];
		r0[0] = nums[0];
		r0[1] = Math.max(nums[0], nums[1]);
		
		
		r1[0] = 0;
		r1[1] = nums[1];
		for (int i = 2; i < nums.length; i++) {
			r0[i] = Math.max(r0[i-1], ((i == nums.length-1)?0:nums[i]) + r0[i-2]);
		}
		for (int i = 2; i < nums.length; i++) {
			r1[i] = Math.max(r1[i-1], nums[i] + r1[i-2]);
		}
		
		return Math.max(r0[nums.length-1], r1[nums.length-1]);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P213_HouseRobber2 r = new P213_HouseRobber2();
		int i = r.rob(new int[] {2,3,2});
		i = r.rob(new int[] {1,2,3,1});

	}

}
