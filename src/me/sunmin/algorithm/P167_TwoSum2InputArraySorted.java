package me.sunmin.algorithm;
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum II - Input array is sorted.


public class P167_TwoSum2InputArraySorted {
	
	public int[] twoSum(int[] numbers, int target) {
		int lo = 0;
		int hi = numbers.length - 1;
		while (lo < hi) {
			int v = numbers[lo] + numbers[hi];
			if (v == target) {
				return new int[] {lo+1, hi+1}; 
			}
			else if (v < target) {
				lo++;
			}
			else {
				hi--;
			}
		}
		return null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
