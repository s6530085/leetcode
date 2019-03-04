package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/summary-ranges/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Summary Ranges.


public class P228_SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
		List<String>list = new ArrayList<String>();
		int begin = 0;
		int end = 0;
		for (int i = 0; i < nums.length;i++) {
			if(i < nums.length - 1 && nums[i] == nums[i+1] - 1) {
				end++;
			}
			else {
				if (end > begin) {
					list.add(nums[begin] + "->" + nums[end]);
				}
				else {
					list.add("" + nums[begin]);
				}
				begin = i+1;
				end  = i+1;
			}
		}
		
		return list;
    }
	
	public static void main(String args[]) {
		P228_SummaryRanges r = new  P228_SummaryRanges();
		
		List<String> l = r.summaryRanges(new int[] {0,1,2,4,5,7});
	}
}
