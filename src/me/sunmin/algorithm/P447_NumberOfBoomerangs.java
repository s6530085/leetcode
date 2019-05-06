package me.sunmin.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/number-of-boomerangs/description/
//Runtime: 159 ms, faster than 17.52% of Java online submissions for Number of Boomerangs.
// todosm

public class P447_NumberOfBoomerangs {
	public int numberOfBoomerangs(int[][] points) {
        Map<Integer, List<int[]>> map = new HashMap<Integer, List<int[]>>();
        for (int i = 0; i < points.length-1; i++) {
        	for (int j = i+1; j < points.length; j++) {
        		int i1 = points[i][0];
        		int i2 = points[i][1];
        		int j1 = points[j][0];
        		int j2 = points[j][1];
        		int d = (j1-i1)*(j1-i1) + (j2-i2)*(j2-i2);
        		List<int[]> l = map.get(d);
        		if (l == null) {
        			l = new ArrayList<int[]>();
        			map.put(d, l);
        		}
        		l.add(new int[] {i, j});
        	}
        }
        
        int num = 0;
        for (List<int[]> l : map.values()) {
        	for (int i = 0; i < l.size()-1; i++) {
        		for (int j = i+1; j < l.size(); j++) {
        			int []p1 = l.get(i);
        			int []p2 = l.get(j);
        			if (p1[0] == p2[0] || p1[0] == p2[1] 
        			 || p1[1] == p2[0] || p1[1] == p2[1]) num++;
        		}
        	}
        }
        return num*2;
    }
	
	public static void main(String[] args) {
		P447_NumberOfBoomerangs b = new P447_NumberOfBoomerangs();
		int i = b.numberOfBoomerangs(new int[][] {{0,0},{1,0},{-1,0},{0,1},{0,-1}});
		int j = 100;
	}
}
