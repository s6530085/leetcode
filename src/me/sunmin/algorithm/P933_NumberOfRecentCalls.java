package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/number-of-recent-calls/
//Runtime: 81 ms, faster than 50.85% of Java online submissions for Minimum Falling Path Sum.

public class P933_NumberOfRecentCalls {
	
	private List<Integer> list = new ArrayList<Integer>();
	
	public P933_NumberOfRecentCalls() {
        
    }
    
    public int ping(int t) {
        list.add(t);
        int target = t - 3000;
        int lo = 0;
        int hi = list.size()-1;
        while (lo <= hi) {
        	int mid = lo + (hi - lo) / 2;
        	int midV = list.get(mid);
        	if (midV >= target) {
        		if (mid == 0) {
        			return list.size();
        		}
        		else {
        			hi = mid-1;
        		}
        	}
        	else {
        		if (list.get(mid+1) >= target) {
        			return list.size() - mid - 1;
        		}
        		else {
        			lo = mid + 1;
        		}
        	}
        }
        return 1;
    }
    
}
