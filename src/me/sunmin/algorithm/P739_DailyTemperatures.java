package me.sunmin.algorithm;

//https://leetcode.com/problems/daily-temperatures/
//Runtime: 5 ms, faster than 99.95% of Java online submissions for Daily Temperatures.

public class P739_DailyTemperatures {

	public int[] dailyTemperatures(int[] T) {
		int[] w = new int[T.length];
		for (int i = T.length - 2; i >= 0; i--) {
			if (T[i] < T[i + 1]) {
				w[i] = 1;
			} else {
				for (int k = i + 1; k < T.length; k += w[k]) {
					if (T[k] > T[i]) {
						w[i] = k - i;
						break;
					}
					if (w[k] == 0) {
						w[i] = 0;
						break;
					}
				}
			}
		}
		return w;
	}

	public static void main(String[] args) {
		P739_DailyTemperatures t = new P739_DailyTemperatures();
		int[] i = t.dailyTemperatures(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 });
	}

}
