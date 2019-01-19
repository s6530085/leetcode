package me.sunmin.algorithm;
//https://leetcode.com/problems/sort-array-by-parity/
//Runtime: 16 ms, faster than 83.03% of Java online submissions for Sort Array By Parity.

public class P905_SortArrayByParity {
	public int[] sortArrayByParity(int[] A) {
        int begin = 0;
		int end = A.length-1;
		while(begin<end) {
			while(A[begin]%2==0 && begin< end){
				begin++;
			}
			while(A[end]%2!=0 && begin < end){
				end--;
			}
			int temp = A[begin];
			A[begin] = A[end];
			A[end] = temp;
			begin++;
			end--;
		}
		return A;

    }
}
