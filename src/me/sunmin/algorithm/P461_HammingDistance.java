package me.sunmin.algorithm;
//https://leetcode.com/problems/hamming-distance/
//Runtime: 8 ms, faster than 97.28% of Java online submissions for Hamming Distance.

public class P461_HammingDistance {
	public int hammingDistance(int x, int y) {
        int distance = 0;
		int z = x ^ y;
		while(z > 0) {
			if ((z & 1) == 1) {
				distance++;
			}
			z = z>>1;
		}
		return distance;
    }
}
