//https://leetcode.com/problems/container-with-most-water/
//Runtime: 4 ms, faster than 94.67% of Java online submissions for Container With Most Water.
// todosm hard to prove
package me.sunmin.algorithm;

public class P011_ContainerWithMostWater {
	
	public int maxArea(int[] height) {
		int lo = 0;
		int hi = height.length-1;
		int maxArea = Integer.MIN_VALUE;
		while (lo < hi) {
			maxArea = Math.max(maxArea, Math.min(height[lo], height[hi])*(hi-lo));
			if (height[lo] < height[hi]) lo++;
			else hi--;
		}
		return maxArea;
    }

	public static void main(String[] args) {
		int[] array = {1,8,6,2,5,4,8,3,7};
		P011_ContainerWithMostWater w = new P011_ContainerWithMostWater();
		w.maxArea(array);
	}

}
