package me.sunmin.algorithm;

//https://leetcode.com/problems/sort-an-array/
//Runtime: 4 ms, faster than 97.42% of Java online submissions for Sort an Array.


public class P912_SortArray {
	
	private void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}
	
	private int partition(int[] nums, int lo, int hi) {
		int i = lo;
		int j = hi+1;
		int v = nums[lo];
		while(true) {
			while (nums[++i] < v) {
				if (i == hi) break;
			}
			while (nums[--j] > v) {
				if (j == lo) break;
			}
			if (i >= j) break;
			swap(nums, i, j);
		}
		swap(nums, lo, j);
		return j;
	}
	
	private void qsort(int[] nums, int lo, int hi) {
		if (lo < hi) {
			int k = partition(nums, lo, hi);
			qsort(nums, lo, k-1);
			qsort(nums, k+1, hi);
		}
	}
	
	public int[] sortArray(int[] nums) {
		qsort(nums, 0, nums.length-1);
		return nums;
    }
}
