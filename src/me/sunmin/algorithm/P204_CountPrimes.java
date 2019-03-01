package me.sunmin.algorithm;
//https://leetcode.com/problems/count-primes/
//Runtime: 12 ms, faster than 91.18% of Java online submissions for Count Primes.

public class P204_CountPrimes {
	
	 public int countPrimes(int n) {
		 int count = 0;
		 boolean notPrimes[] = new boolean[n];
		 for (int i = 2; i < n; i++ ) {
			 if (notPrimes[i]) continue;
			 else {
				 count++;
				 for (int j = i; j < n; j+=j) {
					 notPrimes[i] = true;
				 }
			 }
		 }
		 return count;
	 }
	
}
