package me.sunmin.algorithm;
//https://leetcode.com/problems/jewels-and-stones/
//Runtime: 13 ms, faster than 96.19% of Java online submissions for Jewels and Stones.

public class P771_JewelsAndStones {
	public int numJewelsInStones(String J, String S) {
        int count = 0;
		char[] js = J.toCharArray();
		char[] ss = S.toCharArray();
		for (int i = 0; i < ss.length; i++) {
			char c = ss[i];
			for (int j = 0; j < js.length; j++) {
				char cc = js[j];
				if (c == cc) {
					count++;
					break;
				}
			}
		}
		return count;

    }
}
