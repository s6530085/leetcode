package me.sunmin.algorithm;
//https://leetcode.com/problems/find-k-closest-elements/
//Runtime: 6 ms, faster than 96.29% of Java online submissions for Find K Closest Elements.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P658_FindKClosestElements {
	
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int index = Arrays.binarySearch(arr, x);
		if (index < 0) {
			index = -index - 1;
			if (index != 0) {
				if (Math.abs(x - arr[index-1]) <= Math.abs(x - arr[index])) {
					index--;
				}
			}
		}
		int left = index - 1;
		int right = index + 1;
		while (right - left <= k) {
			if (left >= 0 && right < arr.length) {
				if (Math.abs(x-arr[left]) <= Math.abs(x-arr[right])) {
					left--;
				}
				else {
					right++;
				}
			}
			else if (left < 0) {
				right++;
			}
			else {
				left--;
			}
		}
		List<Integer> l = new ArrayList<Integer>(right-left);
		for (int i = left+1; i < right; i++) {
			l.add(arr[i]);
		}
		return l;
    }
	
	public static void main(String[] args) {
		int a[] = {1,2,3,5,6,7};
		int i = Arrays.binarySearch(a, 4);
	}
	
}
