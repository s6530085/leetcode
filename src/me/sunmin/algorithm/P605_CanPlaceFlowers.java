package me.sunmin.algorithm;
//https://leetcode.com/problems/can-place-flowers/
//Runtime: 5 ms, faster than 95.54% of Java online submissions for Can Place Flowers.

public class P605_CanPlaceFlowers {
	
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		for (int i = 0; i < flowerbed.length; i++) {
			if (n <= 0) break;
			if (flowerbed[i] == 0) {
				if (i == 0) {
					if ((flowerbed.length > 1 && flowerbed[i+1] == 0) || flowerbed.length==1) {
						flowerbed[i] = 1;
						n--;
					}
				}
				else if (i == flowerbed.length-1) {
					if (flowerbed[flowerbed.length-2] == 0) {
						flowerbed[flowerbed.length-1] = 1;
						n--;
					}
				}
				else {
					if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
						flowerbed[i] = 1;
						n--;
					}
				}
			}
		}
		return n <= 0;
    }
	
}
