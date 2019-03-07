package me.sunmin.algorithm;
//https://leetcode.com/problems/super-ugly-number/
//Runtime: 10 ms, faster than 97.44% of Java online submissions for Super Ugly Number.

public class P313_SuperUglyNumber {
	public int nthSuperUglyNumber(int n, int[] primes) {
		int unlies[] = new int[n];
		unlies[0] = 1;
		int[] indexs = new int[primes.length];
		for (int i = 1; i < n; i++) {
			int v = Integer.MAX_VALUE;
			for (int j = 0; j < indexs.length; j++) {
				v = Math.min(unlies[indexs[j]] * primes[j], v);
			}
			for (int j = 0; j < indexs.length; j++) {
				if (v == unlies[indexs[j]] * primes[j]) {
					indexs[j]++;
				}
			}
			unlies[i] = v;
		}
		
		return unlies[n-1];
    }
	
	public static void main(String []args) {
		P313_SuperUglyNumber u = new P313_SuperUglyNumber();
		u.nthSuperUglyNumber(10, new int[] {2,3,5});
	}
}
