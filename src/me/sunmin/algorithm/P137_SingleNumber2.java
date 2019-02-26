package me.sunmin.algorithm;
//https://leetcode.com/problems/single-number-ii/
//Runtime: 5 ms, faster than 34.62% of Java online submissions for Single Number II.
//todosm https://cloud.tencent.com/developer/article/1131945
import java.util.HashMap;
import java.util.Map;

public class P137_SingleNumber2 {
	
	public int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			Integer v = nums[i];
			Integer count = map.get(v);
			if (count == null) {
				map.put(v, 1);
			}
			else {
				map.put(v, count+1);
			}
		}
		for (int key : map.keySet()) {
			if (map.get(key) == 1) {
				return key;
			}
		}
		return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
