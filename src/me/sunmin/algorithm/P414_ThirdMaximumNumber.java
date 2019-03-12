package me.sunmin.algorithm;
//https://leetcode.com/problems/third-maximum-number/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Third Maximum Number.

public class P414_ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
		int first = nums[0];
		int second = Integer.MIN_VALUE+1;
		int third = Integer.MIN_VALUE;
		boolean hasSecond = false;
		boolean hasThird = false;
		for (int i = 1; i < nums.length; i++) {
			int v = nums[i];
			if (v > first) {
				if (hasSecond) {
					third = second;
					hasThird = true;
				}
				second = first;
				hasSecond = true;
				first = v;
			}
			else if (v < first) {
				if (!hasSecond) {
					second = v;
					hasSecond = true;
				}
				else {
					if (v > second) {
						third = second;
						hasThird = true;
						second = v;
					}
					else if (v < second) {
						if (!hasThird) {
							third = v;
							hasThird = true;
						}
						else {
							if (v > third) {
								third = v;
							}
						}
					}
				}
			}
		}
		
		return hasThird ? third : first;
    }
}
