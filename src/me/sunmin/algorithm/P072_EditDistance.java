package me.sunmin.algorithm;
//https://leetcode.com/problems/edit-distance/
//Runtime: 4 ms, faster than 98.90% of Java online submissions for Edit Distance.

public class P072_EditDistance {
	public int minDistance(String word1, String word2) {
		char[] cs1 = word1.toCharArray();
		char[] cs2 = word2.toCharArray();
		int distances[][] = new int[cs1.length+1][cs2.length+1];
		for (int i = 0; i < distances.length; i++) {
			for (int j = 0; j < distances[0].length; j++) {
				if (i == 0 && j == 0) {
					distances[i][j] = 0;
				}
				else if (i == 0) {
					distances[i][j] = j;
				}
				else if (j == 0) {
					distances[i][j] = i;
				}
				else {
					int r = 0;
					if (cs1[i-1] != cs2[j-1]) {
						r = 1;
					}
					distances[i][j] = Math.min(Math.min(distances[i][j-1]+1, distances[i-1][j]+1), distances[i-1][j-1]+r);
				}
			}
		}
		return distances[cs1.length][cs2.length];
    }
	
	public static void main(String[] args) {
		P072_EditDistance e = new P072_EditDistance();
		int i = e.minDistance("horse", "ros");
		i = e.minDistance("intention", "execution");
	}
}
