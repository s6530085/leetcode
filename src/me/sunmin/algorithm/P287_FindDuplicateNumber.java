package me.sunmin.algorithm;
//https://leetcode.com/problems/find-the-duplicate-number/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Find the Duplicate Number.
//todosm
public class P287_FindDuplicateNumber {
	public int findDuplicate(int[] nums) {
        boolean []filled = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
        	if (filled[nums[i]] == true) return nums[i];
        	filled[nums[i]] = true;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		P287_FindDuplicateNumber f = new P287_FindDuplicateNumber();
		int i = f.findDuplicate(new int[] {2,5,9,6,9,3,8,9,7,1});
	}
}
