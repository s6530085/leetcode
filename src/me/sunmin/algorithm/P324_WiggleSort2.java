package me.sunmin.algorithm;

import java.util.Arrays;

public class P324_WiggleSort2 {
	public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] right = Arrays.copyOfRange(nums, (nums.length+1)/2, nums.length);
        for (int i = (nums.length-1)/2; i >= 1; i--) {
        	nums[i*2] = nums[i];
        }
        for (int i = 0; i < right.length; i++) {
        	nums[i*2+1] = right[right.length-i-1];
        }
    }
	
	public static void main(String[] args) {
		P324_WiggleSort2 w = new P324_WiggleSort2();
		int p[] = {1,2,3,4,5,6,7};
		w.wiggleSort(p);
	}
}
