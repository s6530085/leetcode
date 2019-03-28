package me.sunmin.algorithm;
//https://leetcode.com/problems/set-mismatch/
//Runtime: 2 ms, faster than 100.00% of Java online submissions for Set Mismatch.

public class P645_SetMismatch {
	public int[] findErrorNums(int[] nums) {
		boolean a[] = new boolean[nums.length];
		long sum = 0;
		int duplication = -1;
		for (int n : nums) {
			if (a[n-1] == true) duplication = n;
			else {
				a[n-1] = true;
				sum += n;
			}
		}
		
		return new int[] {duplication, (int) (nums.length*(nums.length+1)/2-sum)};
    }
	
	public static boolean a() {
		System.out.print('a');
		return true;
	}
	
	public static void main(String[] args) {
		
		boolean b =  a() || true;
		P645_SetMismatch s= new P645_SetMismatch();
		s.findErrorNums(new int[] {1,1});
	}
}
