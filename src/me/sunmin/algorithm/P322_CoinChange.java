package me.sunmin.algorithm;
//https://leetcode.com/problems/coin-change/
//Runtime: 14 ms, faster than 92.59% of Java online submissions for Coin Change.

public class P322_CoinChange {

	
	public int coinChange(int[] coins, int amount) {
		if (amount == 0) return 0;
		int r[] = new int[amount+1];
		r[0] = 0;
		for (int i : coins) {
			r[i] = 1;
		}
		for (int i = 1; i <= amount; i++) {
			if (r[i] == 1) continue;
			boolean found = false;
			int min = Integer.MAX_VALUE;
			for (int coin : coins) {
				if (i > coin && r[i-coin] != -1) {
					found = true;
					min = Math.min(r[i-coin]+1, min);
				}
			}
			if (found) r[i] = min;
			else r[i] = -1;
		}
		return r[amount];
    }
	
	
	public static void main(String[] args) {
		P322_CoinChange c= new P322_CoinChange();
		int i =c.coinChange(new int[] {1,2,5}, 100);
	}
}
