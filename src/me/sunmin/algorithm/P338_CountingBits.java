package me.sunmin.algorithm;
//https://leetcode.com/problems/counting-bits/
//Runtime: 3 ms, faster than 46.81% of Java online submissions for Counting Bits.
//todosm
public class P338_CountingBits {
	public int[] countBits(int num) {
        int pows[] = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536,131072,262144,524288,1048576};
		int[]result = new int[num+1];
		if (num >= 0) {
			result[0] = 0;
		}
		if (num >= 1) {
			result[1] = 1;
		}
		int powIndex = 1;
		for (int i = 2; i <= num; i++) {
			int base = pows[powIndex];
			if (i == pows[powIndex+1]) {
				result[i] = 1;
				powIndex++;
			}
			else {
				result[i] = 1 + result[i-base];
			}			
		}
		
		return result;

    }
}
