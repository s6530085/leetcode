package me.sunmin.algorithm;
//https://leetcode.com/problems/guess-number-higher-or-lower/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.

public class P374_GuessNumberHigherLower {
	public int guessNumber(int n) {
		int lo = 1;
		int hi = n;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			int g = guess(mid);
			if (g == 0) return mid;
			else if (g > 0) lo = mid+1;
			else hi = mid - 1;
		}
		return -1;
    }
	
	public int guess(int num) {
		return -1;
	}
}
