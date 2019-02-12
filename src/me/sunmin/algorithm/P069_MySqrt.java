package me.sunmin.algorithm;
//https://leetcode.com/problems/sqrtx/
//Runtime: 18 ms, faster than 60.73% of Java online submissions for Sqrt(x).

public class P069_MySqrt {
		
	public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        int lo = 1;
        int hi = Math.min(x >> 1, 46340);
        while (lo <= hi) {
        	int v = lo + ((hi - lo) >> 1);
        	int vp = v * v;
        	if (vp == x) {
        		return v;
        	}
        	else if (vp > x) {
        		hi = v - 1;
        	}
        	else {
        		if ((v+1) * (v+1) > x) {
        			return v;
        		}
        		else {
        			lo = v + 1;
        		}
        	}
        }
        return hi;
    }
	
	public static void main(String[] args) {
		int i2 = (int) Math.sqrt(Integer.MAX_VALUE);
		P069_MySqrt s = new P069_MySqrt();
		int i = s.mySqrt(2147481111);
	}
}
