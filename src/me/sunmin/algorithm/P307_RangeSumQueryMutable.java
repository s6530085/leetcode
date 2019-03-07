package me.sunmin.algorithm;
//https://leetcode.com/problems/range-sum-query-mutable/
//

public class P307_RangeSumQueryMutable {
	
	private int[] raws;
	private int[] sums;
	
	public P307_RangeSumQueryMutable(int[] nums) {
        raws = nums;
        sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
        	sums[i] = (i == 0 ? 0 : sums[i-1]) + nums[i];
        }
    }
    
    public void update(int i, int val) {
        int diff = val - raws[i];
        for (int index = i; index < sums.length; index++) {
        	sums[index] += diff;
        }
    	
    	raws[i] = val;
    }
    
    public int sumRange(int i, int j) {
        return sums[j] - (i == 0 ? 0 : sums[i-1]);
    }
}
