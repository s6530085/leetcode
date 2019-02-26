package me.sunmin.algorithm;
//https://leetcode.com/problems/gas-station/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Gas Station.

public class P134_GasStation {

	public int canCompleteCircuit(int[] gas, int[] cost) {
		int sum = 0;
		int remain = 0;
		int index = 0;
		for (int i = 0; i < gas.length; i++) {
			int value = gas[i] - cost[i];
			sum += value;
			remain += value;
			if (remain < 0) {
				remain = 0;
				index = i+1;
			}
		}
		if (sum < 0) return -1;
		return index;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P134_GasStation g = new P134_GasStation();
		int b = g.canCompleteCircuit(new int[] {3,1,1}, new int[] {1,2,2});
	}

}
