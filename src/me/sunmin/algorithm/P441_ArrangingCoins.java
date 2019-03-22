package me.sunmin.algorithm;
//https://leetcode.com/problems/arranging-coins/
//Runtime: 16 ms, faster than 96.46% of Java online submissions for Arranging Coins.
//category:math

public class P441_ArrangingCoins {
	
	public int arrangeCoins(int n) {
		long nn = n;
        long i = (long)(Math.sqrt(n)* Math.sqrt(2))-1;
        long limit=0;
        do {
        	i++;
        	limit = i*(i+1)/2;
        }while(nn >= limit);
        
		return (int)--i;
    }

	public static void main(String[] args) {
		P441_ArrangingCoins p = new P441_ArrangingCoins();
		p.arrangeCoins(1804289383);

	}

}
