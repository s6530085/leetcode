package me.sunmin.algorithm;
//https://leetcode.com/problems/maximum-swap/
//Runtime: 3 ms, faster than 100.00% of Java online submissions for Maximum Swap.
// todosm greedy
public class P670_MaximumSwap {	
	
	public int maximumSwap(int num) {
		if (num < 10) return num;
		String ns = String.valueOf(num);
		int[] nums = new int[ns.length()];
		for (int i = nums.length - 1; i >= 0; i--) {
			nums[i] = ns.charAt(i) - '0';
		}
		boolean find = false;
		for (int i = 0; i < nums.length -1; i++) {
			if (find) break;
			int max = nums[nums.length-1];
			int maxIndex = nums.length-1;
			for (int j = nums.length - 2; j > i; j--) {
				if (nums[j] > max) {
					max = nums[j];
					maxIndex = j;
				}
			}
			if (nums[i] < max) {
				int temp = nums[i];
				nums[i] = max;
				nums[maxIndex] = temp;
				find = true;
			}
		}
		int n = 0;
		for (int i = 0; i < nums.length; i++) {
			n = n * 10 + nums[i];
		}
		return n;
    }
	
	public static void main(String[] args) {
		P670_MaximumSwap s = new P670_MaximumSwap();
		int i = s.maximumSwap(2736);
	}

}
