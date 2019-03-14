package me.sunmin.algorithm;
//https://leetcode.com/problems/kth-largest-element-in-a-stream/
//Runtime: 71 ms, faster than 76.65% of Java online submissions for Kth Largest Element in a Stream.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P703_KthLargestElementStream {
	
	private int index;
   	private List<Integer>list = new ArrayList<Integer>();

	
	public P703_KthLargestElementStream(int k, int[] nums) {
        index = k;
        Arrays.sort(nums);
        for (int n : nums) {
        	list.add(n);
        }
    }
    
    public int add(int val) {
    	int i = Collections.binarySearch(list, val);
    	if (i < 0) {
    		i = -i - 1;
    	}
    	list.add(i, val);
    	return list.get(list.size() - index);
    }
    
    public static void main(String[] args) {
    	P703_KthLargestElementStream s = new P703_KthLargestElementStream(3, new int[] {4,5,8,2});
    	int i = s.add(3);
    	i = s.add(5);
    	i = s.add(10);
    	i = s.add(9);
    	i = s.add(4);
    }
}
