package me.sunmin.algorithm;

import java.util.Arrays;
import java.util.Comparator;

//https://leetcode.com/problems/largest-number/
//Runtime: 10 ms, faster than 99.38% of Java online submissions for Largest Number.


public class P179_LargestNumber {

	public String largestNumber(int[] nums) {
		String[] ss = new String[nums.length];
		for (int i = 0; i < ss.length; i++) {
			ss[i] = String.valueOf(nums[i]);
		}
		
		Arrays.sort(ss, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return -(o1+o2).compareTo(o2+o1);
			}
		});
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ss.length; i++) {
			sb.append(ss[i]);
			if (i == 0 && ss[i].equals("0")) break;
		}
		return sb.toString();
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P179_LargestNumber p = new P179_LargestNumber();
		String s = p.largestNumber(new int[] {3,30,34,5,9});
	}

}
