package me.sunmin.algorithm;
//https://leetcode.com/problems/friend-circles/
//Runtime: 4 ms, faster than 100.00% of Java online submissions for Friend Circles.
//category:uf

public class P547_FriendCircles {
	
	private int getP(int i) {
		while (uf[i] != i) {
			i = uf[i];
		}
		return i;
	}
	
	private int[] uf;
	
	public int findCircleNum(int[][] M) {
		
		uf = new int[M.length];
		for (int i = 0; i < uf.length; i++) {
			uf[i] = i;
		}
		
		for (int i = 0; i < M.length; i++) {
			for (int j = i+1; j < M[0].length; j++) {
				if (M[i][j] == 1) {
					int pi = getP(i);
					int pj = getP(j);
					uf[pj] = pi; 
				}
			}
		}
		
		int count = 0;
		for (int i = 0; i < uf.length; i++) {
			if (getP(i) == i) count++;
		}
		return count;	
    }
	
	
	public static void main(String[] args) {
		P547_FriendCircles c = new P547_FriendCircles();
//		int i = c.findCircleNum(new int[][] {{1,0,0,1}, {0,1,0,0}, {0,1,1,1},{1,0,1,1}});
		int i=c.findCircleNum(new int[][]
				{
			{1,1,0,0,0,0,0,1,0,1},
			{1,1,0,0,0,0,0,0,0,0},
			{0,0,1,0,0,0,1,0,0,0},
			{0,0,0,1,0,0,0,0,0,0},
			{0,0,0,0,1,0,0,0,0,0},
			{0,0,0,0,0,1,0,0,0,0},
			{0,0,1,0,0,0,1,1,0,0},
			{1,0,0,0,0,0,1,1,0,0},
			{0,0,0,0,0,0,0,0,1,1},
			{1,0,0,0,0,0,0,0,1,1}
						});
		
//		int z = 100;
		System.out.println(i);

	}
	
}
