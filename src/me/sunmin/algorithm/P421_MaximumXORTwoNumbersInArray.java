package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
//Runtime: 53 ms, faster than 50.97% of Java online submissions for Maximum XOR of Two Numbers in an Array.
//todosm category:trie

public class P421_MaximumXORTwoNumbersInArray {
	
	public int findMaximumXOR(int[] nums) {
		if (nums.length <= 1) return 0;
        int maximum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				int v = nums[i] ^ nums[j];
				if (v > maximum) {
					maximum = v;
				}
			}
		}
		return maximum;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
