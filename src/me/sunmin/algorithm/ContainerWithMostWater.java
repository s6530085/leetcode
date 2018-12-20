//https://leetcode.com/problems/container-with-most-water/
//Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
//
//Note: You may not slant the container and n is at least 2.

package me.sunmin.algorithm;

public class ContainerWithMostWater {
	
	static public int maxArea(int[] height) {
		int maxArea = 0;
		
		return maxArea;
		
		// 下面是最优解发，但是我没弄明白其证明原理
//		int maxarea = 0, l = 0, r = height.length - 1;
//        while (l < r) {
//            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
//            if (height[l] < height[r])
//                l++;
//            else
//                r--;
//        }
//        return maxarea;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,100,1,1,1,1,1,2};
		int a = ContainerWithMostWater.maxArea(array);
	}

}
