package me.sunmin.algorithm;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-product-of-three-numbers/
//Runtime: 16 ms, faster than 56.02% of Java online submissions for Maximum Product of Three Numbers.

public class P628_MaximumProductThreeNumbers {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int pos = Arrays.binarySearch(nums, 0);
		int l = nums.length;
		int large = 0;
		int small = 0;
		if (pos >= 0) {
			int temp = pos;
			while (temp < l) {
				if (nums[temp] == 0) temp++;
				else break;
			}
			large = l - temp;
			
			temp = pos;
			while(temp >= 0) {
				if (nums[temp] == 0) temp--;
				else break;
			}
			small = temp+1;
			if (small + large < 3) return 0;
		}
		else {
			large = l - (-pos-1);
			small = (-pos-1);
		}
		if (large >= 3) {
			return Math.max(nums[l-3] * nums[l-2], nums[0] * nums[1]) * nums[l-1];
		}
		else if (large >= 1) {
			return nums[0] * nums[1] * nums[l-1];
		}
		else {
			if (pos < 0) {
				return nums[l-3] * nums[l-2] * nums[l-1];
			}
			else {
				return nums[l-4] * nums[l-3] * nums[l-2];
			}
		}
		
    }
	
	public static void main(String[] args) {
		P628_MaximumProductThreeNumbers p = new P628_MaximumProductThreeNumbers();
		int i = p.maximumProduct(new int[] {-4,-3,-2,-1,1,2,3,4,5});
	}
}
