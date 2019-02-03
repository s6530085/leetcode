package me.sunmin.algorithm;
//https://leetcode.com/problems/jump-game/
//Runtime: 4 ms, faster than 93.25% of Java online submissions for Jump Game.

public class P055_JumpGame {

	public boolean canJump(int[] nums) {
        if (nums == null || nums.length < 2)	return true;
        int distance = 0 + nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
        	if (distance < i) {
        		return false;
        	}
        	if (nums[i] + i > distance) {
        		distance = nums[i] + i;        		
        	}
        	if (distance >= nums.length - 1) {
        		return true;
        	}
        }
        
        return distance >= nums.length - 1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
