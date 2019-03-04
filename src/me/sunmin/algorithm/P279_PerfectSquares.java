package me.sunmin.algorithm;

//https://leetcode.com/problems/perfect-squares/
//Runtime: 16 ms, faster than 96.34% of Java online submissions for Perfect Squares.

public class P279_PerfectSquares {
	
	public int numSquares(int n) {
		int squares[] = new int[n+1];
		squares[0] = 0;
		squares[1] = 1;
		for (int i = 2; i <= n; i++) {
			int t = (int)Math.sqrt(i);
			if (t*t == i) {
				squares[i] = 1;
			}
			else {
				int min = Integer.MAX_VALUE;
				for (int j = 1; j <= t; j++) {
					min = Math.min(squares[i-j*j] + 1, min);
				}
				squares[i] = min;
			}	
		}
		
		return squares[n];
    }
	
	public static void main(String[] args) {
		P279_PerfectSquares p = new P279_PerfectSquares();
		int i = p.numSquares(4);
		i = p.numSquares(12);
		i = p.numSquares(13);
	}
}
