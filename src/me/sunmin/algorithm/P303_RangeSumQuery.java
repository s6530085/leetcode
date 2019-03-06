package me.sunmin.algorithm;
//https://leetcode.com/problems/range-sum-query-immutable/submissions/
//Runtime: 54 ms, faster than 96.38% of Java online submissions for Range Sum Query - Immutable.

public class P303_RangeSumQuery {

	private int sums[];
	public P303_RangeSumQuery(int[] nums) {
		sums = new int[nums.length+1];
		sums[0] = 0;
		for (int i = 0; i < nums.length; i++) {
			sums[i+1] = sums[i] + nums[i];
		}
    }
    
    public int sumRange(int i, int j) {
    	return sums[j+1] - sums[i];
    }
    
}
