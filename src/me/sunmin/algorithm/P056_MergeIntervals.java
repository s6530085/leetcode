package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//https://leetcode.com/problems/merge-intervals/
//Runtime: 21 ms, faster than 53.62% of Java online submissions for Merge Intervals.

public class P056_MergeIntervals {
	public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null) return null;
		if (intervals.size() <= 1) return intervals;

        intervals.sort(new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
		});
		List<Interval> list = new ArrayList<Interval>();
		Interval last = intervals.remove(0);
		list.add(last);
		while(!intervals.isEmpty()) {
			Interval current = intervals.remove(0);
			if (last.end >= current.start) {
				last.end = Math.max(current.end, last.end);
			}
			else {
				list.add(current);
                last = current;
			}
		}
		return list;
    }
}
