package me.sunmin.algorithm;
//https://leetcode.com/problems/ugly-number-ii/
//Runtime: 2 ms, faster than 99.73% of Java online submissions for Ugly Number II.

public class P264_UglyNumber2 {
	public int nthUglyNumber(int n) {
        int unlies[] = new int[n];
		unlies[0] = 1;
		int th2 = 0;
		int th3 = 0; 
		int th5 = 0;
		for (int i = 1; i < n; i++) {
			int v = Math.min(unlies[th2] * 2, Math.min(unlies[th3] * 3, unlies[th5]*5));
			if (v == unlies[th2] * 2) {
				th2++;
			}
			if (v == unlies[th3] * 3) {
				th3++;
			}
			if (v == unlies[th5] * 5) {
				th5++;
			}
			unlies[i] = v;
		}
		
		return unlies[n-1];
    }
}
