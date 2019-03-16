package me.sunmin.algorithm;

import java.util.Arrays;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
//Runtime: 32 ms, faster than 31.79% of Java online submissions for Kth Largest Element in an Array.
// todosm category:sort

public class P215_KthLargestElementArray {
	
	private int partition(int[] nums, int begin, int end) {
		int pivit = nums[begin];
		while (begin < end) {
			while (begin < end && nums[end] <= pivit) end--;
			nums[begin] = nums[end];
			while (begin < end && nums[begin] >= pivit) begin++;
			nums[end] = nums[begin];
		}
		nums[begin] = pivit;
		return begin;
	}
	
	public int findKthLargest(int[] nums, int k) {
		int begin = 0;
		int end = nums.length - 1;
		do {
			int large = partition(nums, begin, end);
			if (large == k-1) {
				return nums[large];
			}
			else if (large > k-1) {
				end = large - 1;
			}
			else {
				begin = large + 1;
			}
		}while(true);
    }
	
	public static void main(String[] args) {
		P215_KthLargestElementArray k = new P215_KthLargestElementArray();
		int i = k.findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 4);
	}
}
