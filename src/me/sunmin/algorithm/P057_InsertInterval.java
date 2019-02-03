package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/insert-interval/
//Runtime: 7 ms, faster than 80.49% of Java online submissions for Insert Interval.

public class P057_InsertInterval {
	private boolean hasInsect(Interval i1, Interval i2) {
		return (i1.start >= i2.start && i1.start <= i2.end) 
				|| (i1.end >= i2.start && i1.end <= i2.end)
				|| (i2.start >= i1.start && i2.start <= i1.end) 
				|| (i2.end >= i1.start && i2.end <= i1.end);
	}
	
	private Interval insect(Interval i1, Interval i2) {
		return new Interval(Math.min(i1.start, i2.start), Math.max(i1.end, i2.end));
	}
	
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		if (intervals == null) return null;
		if (intervals.size() == 0) return new ArrayList<Interval>(Arrays.asList(newInterval));
		
        List<Interval>list = new ArrayList<Interval>();
        boolean changed = false;
        for (int i = 0; i < intervals.size(); i++) {
        	Interval current = intervals.get(i);
        	if (hasInsect(current, newInterval)) {
        		changed = true;
        		newInterval = insect(current, newInterval);
                if (i == intervals.size()-1) {
        			list.add(newInterval);
        		}
        	}
        	else {
        		if (changed) {
        			list.add(newInterval);
        			list.add(current);			
        			for (int j = i+1; j < intervals.size(); j++) {
        				list.add(intervals.get(j));
        			}
        			break;
        		}
        		else {
        			list.add(current);
        		}
        	}
        }
        if (!changed) {
        	
        }
        if (list.isEmpty()) {
        	list.add(newInterval);
        }
        else {
        	if (!changed) {
        		int insertIndex = 0;
        		for (; insertIndex < list.size(); insertIndex++) {
        			if (list.get(insertIndex).start > newInterval.end) {
        				break;
        			}
        		}
        		list.add(insertIndex, newInterval);
        	}
        }
        
        return list;
    }
}
