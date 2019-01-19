package me.sunmin.algorithm;
//https://leetcode.com/problems/delete-columns-to-make-sorted
//Runtime: 19 ms, faster than 88.87% of Java online submissions for Delete Columns to Make Sorted.

public class P944_DeleteColumnsToMakeSorted {
	public int minDeletionSize(String[] A) {
        int deleteCount = 0;
		
		char[][] cs = new char[A.length][A[0].length()];
		for (int i = 0; i < A.length; i++) {
			cs[i] = A[i].toCharArray();
		}
		for (int i = 0; i < A[0].length(); i++) {
			for (int j = 1; j < A.length; j++) {
				if (cs[j][i] < cs[j-1][i]) {
					deleteCount++;
					break;
				}
			}
		}
		return deleteCount;

    }
}
