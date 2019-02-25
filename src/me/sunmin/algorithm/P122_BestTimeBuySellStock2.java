package me.sunmin.algorithm;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
//Runtime: 1 ms, faster than 99.10% of Java online submissions for Best Time to Buy and Sell Stock II.


public class P122_BestTimeBuySellStock2 {
	
	public int maxProfit(int[] prices) {
        int profit = 0;
        boolean needup = true;
        int lastIndex = -1;
        for (int i = 0; i < prices.length - 1; i++) {
        	if (needup) {
        		if (prices[i] >= prices[i+1]) {
        			continue;
        		}
        		else {
        			needup = false;	
        			lastIndex = i;
        		}
        	}
        	else {
        		if (prices[i] < prices[i+1]) {
        			continue;
        		}
        		else {
        			needup = true;
        			profit +=  prices[i] - prices[lastIndex];
        		}
        	}
        }
        if (!needup) {
        	profit += prices[prices.length-1] - prices[lastIndex];
        }
        return profit;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P122_BestTimeBuySellStock2 s = new P122_BestTimeBuySellStock2();
		int i = s.maxProfit(new int[] {1,2,3,4,5});
	}

}
