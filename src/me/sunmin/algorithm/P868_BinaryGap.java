package me.sunmin.algorithm;
//https://leetcode.com/problems/binary-gap/
//Runtime: 14 ms, faster than 62.32% of Java online submissions for Binary Gap.

public class P868_BinaryGap {
	public int binaryGap(int N) {
        int maxGap = 0;
		int gap = 0;
		boolean counterOne = false;
		while (N > 0) {
			if ((N & 1) == 1) {
				if (!counterOne) {
					counterOne = true;
				}
				else {
					gap++;
					if (maxGap < gap) {
						maxGap = gap;
					}
					gap = 0;
				}
			}
			else {
				if (counterOne) {
					gap++;
				}
			}
			N >>= 1;
		}
		
		return maxGap;

    }
}
