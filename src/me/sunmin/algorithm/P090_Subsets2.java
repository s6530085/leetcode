package me.sunmin.algorithm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/subsets-ii/
//Runtime: 2 ms, faster than 97.28% of Java online submissions for Subsets II.

public class P090_Subsets2 {

	private void p(int[] nums, int index, List<Integer>l, List<List<Integer>>ls) {
		if (index == nums.length) {
			return;
		}
		for (int i = index; i < nums.length; i++) {
			if (i == index || nums[i-1] != nums[i]) {
				List<Integer> nl = new ArrayList<Integer>(l);
				nl.add(nums[i]);
				ls.add(nl);
				p(nums, i+1, nl, ls);
			}
		}
	}
	
	
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        List<Integer> l = new ArrayList<Integer>();
        ls.add(l);
        p(nums, 0, l, ls);
        return ls;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P090_Subsets2 s = new P090_Subsets2();
		List<List<Integer>> k = s.subsetsWithDup(new int[] {1,2,2});
	}

}
