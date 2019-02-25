package me.sunmin.algorithm;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//Runtime: 1 ms, faster than 99.69% of Java online submissions for Best Time to Buy and Sell Stock.

public class P121_BestTimeBuySellStock {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length <= 1) return 0;
		int profit = 0;
        int minValue = prices[0];
        for (int i = 1; i < prices.length; i++) {
        	if (prices[i] - minValue > profit) {
    			profit = prices[i] - minValue;
    		}
        	if (prices[i] < minValue) {
        		minValue = prices[i];
        	}
        }
        
        return profit;
    }
}
