package me.sunmin.algorithm;
//https://leetcode.com/problems/binary-watch/
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Binary Watch.

import java.util.ArrayList;
import java.util.List;

public class P401_BinaryWatch {
	
	private void p(int[]nums, int size, int count, int index, int sum, int limit, List<Integer>l) {
		if (sum >= limit) return;
		if (size == count) {
			l.add(sum);
			return;
		}
		if (index == nums.length) return;
		p(nums, size, count, index+1, sum, limit, l);
		p(nums, size, count+1, index+1, sum+nums[index], limit, l);
	}
	
	
	public List<String> readBinaryWatch(int num) {
		int hours[] = {1,2,4,8};
		int minutes[] = {1,2,4,8,16,32};
		List<String> list = new ArrayList<String>();
		for (int i = 0; i <= num; i++) {
			if (i < hours.length && num-i < minutes.length) {
				List <Integer> hs = new ArrayList<Integer>();
				List <Integer> ms = new ArrayList<Integer>();
				p(hours, i, 0, 0, 0, 12, hs);
				p(minutes, num-i, 0, 0, 0, 60, ms);
				for (int h : hs) {
					for (int m : ms) {
						list.add(String.format("%d:%02d", h, m));
					}
				}
			}
		}
		return list;
    }
	
	public static void main(String[] args) {
//		String []s1 = {"0:40","0:24","0:36","0:20","0:12",
//				"0:34","0:18","0:10","0:06","0:33","0:17","0:09","0:05","0:03",
//				"8:32","8:16","8:08","8:04","8:02","8:01","4:32","4:16","4:08",
//				"4:04","4:02","4:01","2:32","2:16","2:08","2:04","2:02","2:01",
//				"1:32","1:16","1:08","1:04","1:02","1:01",
//				"12:00","10:00","6:00","9:00","5:00","3:00"};
//		String []s2 = {"0:03","0:05","0:06","0:09","0:10","0:12","0:17","0:18",
//				"0:20","0:24","0:33","0:34","0:36","0:40","1:01","1:02",
//				"1:04","1:08","1:16","1:32","2:01","2:02","2:04","2:08","2:16",
//				"2:32","3:00","4:01","4:02","4:04","4:08","4:16","4:32","5:00",
//				"6:00","8:01","8:02","8:04","8:08","8:16","8:32","9:00","10:00"};
		
		P401_BinaryWatch b = new P401_BinaryWatch();
		List<String > l = b.readBinaryWatch(1);
	}
}
