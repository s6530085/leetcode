package me.sunmin.algorithm;
//https://leetcode.com/problems/queue-reconstruction-by-height/
// todosm timeout

public class P406_QueueReconstructionByHeight {
	private boolean isOrdered(int[][] people, int atIndex) {
		int h = people[atIndex][0];
		int k = people[atIndex][1];
		if (atIndex == 0) {
			return k == 0;
		}
		int lessOrEqual = 0;
		for (int i = 0; i < atIndex; i++) {
			int ih = people[i][0];
			if (h <= ih) {
				lessOrEqual++;
			}
		}
		return lessOrEqual == k;
	}
	
	private static int[][] result;
	private static boolean finish;
	
	private void p_reco(int[][] people, int index) {
		if (finish) {
			return;
		}
		if (index == people.length) {
			finish = true;
			return;
		}
		for (int k = 0; k < people.length; k++) {
			if (finish)	return;
			result[index] = people[k];
			if (isOrdered(result, index)) {
				p_reco(people, index+1);
			}
		}
	}
	
	public int[][] reconstructQueue(int[][] people) {
		finish = false;
		result = new int[people.length][];
		for (int i = 0; i < people.length; i++) {
			if (!finish) {
				result[0] = people[i];
				if (isOrdered(result, 0)) {
					p_reco(people, 1);
				}
			}
		}
		return result;
	}
}
